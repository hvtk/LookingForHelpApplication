insert into page (page_name) values ('Children');
insert into page (page_name) values ('Adults');
insert into page (page_name) values ('Elderly');
insert into page (page_name) values ('Youth');
insert into page (page_name) values ('Sign-in');
insert into page (page_name) values ('Sign-up');
insert into page (page_name) values ('Home');
insert into page (page_name) values ('After-search-query');

insert into problem (problem_name, problem_types) values ('Self-confidence', 'Emotional-problems');
insert into problem (problem_name, problem_types) values ('Stressed-out', 'Emotional-problems');
insert into problem (problem_name, problem_types) values ('Worry-about','Emotional-problems' );
insert into problem (problem_name, problem_types) values ('Guilty-feelings', 'Emotional-problems');
insert into problem (problem_name, problem_types ) values ('Loneliness', 'Emotional-problems');
insert into problem (problem_name, problem_types) values ('Fear', 'Mental-health-problems');
insert into problem (problem_name, problem_types) values ('Panic', 'Mental-health-problems');
insert into problem (problem_name, problem_types) values ('Depression', 'Mental-health-problems');
insert into problem (problem_name, problem_types) values ('Addiction', 'Mental-health-problems');
insert into problem (problem_name, problem_types) values ('Burnout', 'Mental-health-problems');
insert into problem (problem_name, problem_types) values ('Suicide', 'Mental-health-problems');
insert into problem (problem_name, problem_types) values ('Abdominal-pains', 'Physical-complaints');
insert into problem (problem_name, problem_types) values ('Headache', 'Physical-complaints');
insert into problem (problem_name, problem_types) values ('Constant-tiredness', 'Physical-complaints');
insert into problem (problem_name, problem_types) values ('Palpitations', 'Physical-complaints');
insert into problem (problem_name, problem_types) values ('Intestinal-complains','Physical-complaints' );
insert into problem (problem_name, problem_types) values ('Sore-muscles-and-joints', 'Physical-complaints');
insert into problem (problem_name, problem_types) values ('Domestic-violence', 'Physical-violence');
insert into problem (problem_name, problem_types) values ('Child-abuse', 'Physical-violence');
insert into problem (problem_name, problem_types) values ('Violence', 'Physical-violence');

insert into search_topic (age_group) values ('Children');
insert into search_topic (age_group) values ('Adults');
insert into search_topic (age_group) values ('Elderly');
insert into search_topic (age_group) values ('Youth');

insert into take_action (take_action_types) values ('Testing');
insert into take_action (take_action_types) values ('Activities');
insert into take_action (take_action_types) values ('Research-information');
insert into take_action (take_action_types) values ('Can-do-it-yourself');

insert into media_type (media_type_name) values ('Youtube');
insert into media_type (media_type_name) values ('Communities');
insert into media_type (media_type_name) values ('Video');
insert into media_type (media_type_name) values ('Twitter');
insert into media_type (media_type_name) values ('Facebook');


insert into users (username, password, enabled, age, postal_code) values ('user', '$2a$10$r7vOUjHFH34pmJHRcMC/lOHtpIMAF1/p.iu4SIVjxDJ7V3AeHWoUG', TRUE, 5, '1234AB');
insert into users (username, password, enabled, age, postal_code) values ('admin','$2a$10$r7vOUjHFH34pmJHRcMC/lOHtpIMAF1/p.iu4SIVjxDJ7V3AeHWoUG', TRUE, 5, '1234AB');
insert into users (username, password, enabled, age, postal_code) values ('henk','$2a$10$r7vOUjHFH34pmJHRcMC/lOHtpIMAF1/p.iu4SIVjxDJ7V3AeHWoUG', TRUE, 5, '1234AB');


insert into authorities (username, authority) values ('user', 'ROLE_USER');
insert into authorities (username, authority) values ('admin', 'ROLE_USER');
insert into authorities (username, authority) values ('admin', 'ROLE_ADMIN');
insert into authorities (username, authority) values ('henk', 'ROLE_USER');
insert into authorities (username, authority) values ('henk', 'ROLE_ADMIN');
