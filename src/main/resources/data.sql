insert into page (page_name) values ('Children');
insert into page (page_name) values ('Adults');
insert into page (page_name) values ('Elderly');
insert into page (page_name) values ('Youth');
insert into page (page_name) values ('Sign-in');
insert into page (page_name) values ('Sign-up');
insert into page (page_name) values ('Home');
insert into page (page_name) values ('After-search-query');

insert into problem (problem_name) values ('Self-confidence');
insert into problem (problem_name) values ('Stressed-out');
insert into problem (problem_name) values ('Worry-about');
insert into problem (problem_name) values ('Quilty-feelings');
insert into problem (problem_name) values ('Loneliness');
insert into problem (problem_name) values ('Fear');
insert into problem (problem_name) values ('Panic');
insert into problem (problem_name) values ('Depression');
insert into problem (problem_name) values ('Addiction');
insert into problem (problem_name) values ('Burnout');
insert into problem (problem_name) values ('Suicide');
insert into problem (problem_name) values ('Abdominal-pains');
insert into problem (problem_name) values ('Headache');
insert into problem (problem_name) values ('Constant-tiredness');
insert into problem (problem_name) values ('Palpitations');
insert into problem (problem_name) values ('Intestinal-complains');
insert into problem (problem_name) values ('Sore-muscles-and-joints');
insert into problem (problem_name) values ('Dometic-violence');
insert into problem (problem_name) values ('Child-abuse');
insert into problem (problem_name) values ('Violence');

insert into search_topic (age_group) values ('Children');
insert into search_topic (age_group) values ('Adults');
insert into search_topic (age_group) values ('Elderly');
insert into search_topic (age_group) values ('Youth');

insert into take_action (take_action_name) values ('Testing');
insert into take_action (take_action_name) values ('Activities');
insert into take_action (take_action_name) values ('Research-information');
insert into take_action (take_action_name) values ('Can-do-it-yourself');

insert into users (username, password, enabled, age, postal_code) values ('user', '$2a$10$r7vOUjHFH34pmJHRcMC/lOHtpIMAF1/p.iu4SIVjxDJ7V3AeHWoUG', TRUE, 5, '1234AB');
insert into users (username, password, enabled, age, postal_code) values ('admin','$2a$10$r7vOUjHFH34pmJHRcMC/lOHtpIMAF1/p.iu4SIVjxDJ7V3AeHWoUG', TRUE, 5, '1234AB');
insert into users (username, password, enabled, age, postal_code) values ('henk','$2a$10$r7vOUjHFH34pmJHRcMC/lOHtpIMAF1/p.iu4SIVjxDJ7V3AeHWoUG', TRUE, 5, '1234AB');

insert into authorities (username, authority) values ('user', 'ROLE_USER');
insert into authorities (username, authority) values ('admin', 'ROLE_USER');
insert into authorities (username, authority) values ('admin', 'ROLE_ADMIN');
insert into authorities (username, authority) values ('henk', 'ROLE_USER');
insert into authorities (username, authority) values ('henk', 'ROLE_ADMIN');
