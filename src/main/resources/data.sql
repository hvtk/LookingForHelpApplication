insert into search_topic (age_group) values ('Children');
insert into search_topic (age_group) values ('Adults');
insert into search_topic (age_group) values ('Elderly');
insert into search_topic (age_group) values ('Youth');

insert into page (page_name) values ('Children');
insert into page (page_name) values ('Adults');
insert into page (page_name) values ('Elderly');
insert into page (page_name) values ('Youth');
insert into page (page_name) values ('Sign-in');
insert into page (page_name) values ('Sign-up');
insert into page (page_name) values ('Home');
insert into page (page_name) values ('After-search-query');

insert into take_action (take_action_types) values ('Testing');
insert into take_action (take_action_types) values ('Activities');
insert into take_action (take_action_types) values ('Research-information');
insert into take_action (take_action_types) values ('Can-do-it-yourself');

insert into treatment (treatment_types) values ('Therapy');
insert into treatment (treatment_types) values ('Clinics');
insert into treatment (treatment_types) values ('Coaching');

insert into media_information (media_types) values ('Youtube');
insert into media_information (media_types) values ('Communities');
insert into media_information (media_types) values ('Video');
insert into media_information (media_types) values ('Twitter');
insert into media_information (media_types) values ('Facebook');
insert into media_information (media_types) values ('Forum');

insert into media_option (media_option_name) values ('ChatOption');
insert into media_option (media_option_name) values ('WhatsappOption');
insert into media_option (media_option_name) values ('TwitterOption');
insert into media_option (media_option_name) values ('FacebookOption');
insert into media_option (media_option_name) values ('YoutubeOption');
insert into media_option (media_option_name) values ('VideoOption');
insert into media_option (media_option_name) values ('CommunitiesOption');
insert into media_option (media_option_name) values ('Forum');

insert into expertise (expertise_name) values ('Fearknowledge');
insert into expertise (expertise_name) values ('Panicknowledge');
insert into expertise (expertise_name) values ('Depressionknowledge');
insert into expertise (expertise_name) values ('Addictionknowledge');
insert into expertise (expertise_name) values ('Burnoutknowledge');
insert into expertise (expertise_name) values ('Suicideknowledge');

insert into costs_aid_worker_treatment (costs_aid_worker_treatment_part) values ('HealthInsurance');
insert into costs_aid_worker_treatment (costs_aid_worker_treatment_part) values ('ReferNecessaryFamilyDoctor');

insert into users (username, password, enabled, age, postal_code) values ('user', '$2a$10$r7vOUjHFH34pmJHRcMC/lOHtpIMAF1/p.iu4SIVjxDJ7V3AeHWoUG', TRUE, 5, '1234AB');
insert into users (username, password, enabled, age, postal_code) values ('admin','$2a$10$r7vOUjHFH34pmJHRcMC/lOHtpIMAF1/p.iu4SIVjxDJ7V3AeHWoUG', TRUE, 5, '1234AB');
insert into users (username, password, enabled, age, postal_code) values ('henk','$2a$10$r7vOUjHFH34pmJHRcMC/lOHtpIMAF1/p.iu4SIVjxDJ7V3AeHWoUG', TRUE, 5, '1234AB');

insert into authorities (username, authority) values ('user', 'ROLE_USER');
insert into authorities (username, authority) values ('admin', 'ROLE_USER');
insert into authorities (username, authority) values ('admin', 'ROLE_ADMIN');
insert into authorities (username, authority) values ('henk', 'ROLE_USER');
insert into authorities (username, authority) values ('henk', 'ROLE_ADMIN');
