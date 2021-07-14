package henkvantkruijs.LookingForHelp.controller;

import henkvantkruijs.LookingForHelp.exception.BadRequestException;
import henkvantkruijs.LookingForHelp.model.User;
import henkvantkruijs.LookingForHelp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Map;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private static final String storageLocation = "/tmp/";

    @Autowired
    private UserService userService;

    @GetMapping(value = "")
    public ResponseEntity<Object> getUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @GetMapping(value = "/{username}")
    public ResponseEntity<Object> getUser(@PathVariable("username") String username) {
        return ResponseEntity.ok().body(userService.getUser(username));
    }

    // Route om avatar te uploaden, deze ontvangt een bestand via de multipart form data, en verplaatst deze naar de storagefolder die bovenaan gedefinieerd is
    @PostMapping(value = "/{username}/avatar")
    public ResponseEntity<Object> uploadFile(
            @PathVariable("username") String username,
            @RequestParam("file") MultipartFile multipartFile) throws IOException {
        multipartFile.transferTo(new File(storageLocation + username + ".jpg"));
        return ResponseEntity.ok().body("Upload geslaagd!");
    }

    // https://stackoverflow.com/questions/40557637/how-to-return-an-image-in-spring-boot-controller-and-serve-like-a-file-system
    // Haal de avatar op
    @GetMapping(value = "/{username}/avatar")
    public ResponseEntity<byte[]> uploadFile(
            @PathVariable("username") String username) throws IOException {
        // Open het bestand
        File file = new File(storageLocation + username + ".jpg");
        FileInputStream fis = new FileInputStream(file);

        // Lees alle data
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();

        // Schrijf de afbeelding naar de response, en zet de content type op afbeelding/jpg
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(data);
    }

    @PostMapping(value = "/signup")
    public ResponseEntity<Object> signUpUser(@RequestBody User user) {
        String newUsername = userService.createUser(user);

        return ResponseEntity.ok().body(userService.getUser(newUsername));
    }

    @PostMapping(value = "")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        String newUsername = userService.createUser(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{username}")
                .buildAndExpand(newUsername).toUri();

        return ResponseEntity.created(location).build();
    }

    @PutMapping(value = "/{username}")
    public ResponseEntity<Object> updateUser(@PathVariable("username") String username, @RequestBody User user) {
        userService.updateUser(username, user);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "/{username}")
    public ResponseEntity<Object> deleteUser(@PathVariable("username") String username) {
        userService.deleteUser(username);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/{username}/authorities")
    public ResponseEntity<Object> getUserAuthorities(@PathVariable("username") String username) {
        return ResponseEntity.ok().body(userService.getAuthorities(username));
    }

    @PostMapping(value = "/{username}/authorities")
    public ResponseEntity<Object> addUserAuthority(@PathVariable("username") String username, @RequestBody Map<String, Object> fields) {
        try {
            String authorityName = (String) fields.get("authority");
            userService.addAuthority(username, authorityName);
            return ResponseEntity.noContent().build();
        }
        catch (Exception ex) {
            throw new BadRequestException();
        }
    }

    @DeleteMapping(value = "/{username}/authorities/{authority}")
    public ResponseEntity<Object> deleteUserAuthority(@PathVariable("username") String username, @PathVariable("authority") String authority) {
        userService.removeAuthority(username, authority);
        return ResponseEntity.noContent().build();
    }
}
