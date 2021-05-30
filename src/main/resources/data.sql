insert into aid_worker (aid_worker_name, aid_worker_webb_address, aid_worker_types) values ('Arjen Luijendijk', 'http://www.arjenluijendijk.nl', 'SPECIALIST');
insert into aid_worker (aid_worker_name, aid_worker_webb_address, aid_worker_types) values ('Cas Lauwen', 'http://www.caslauwen.nl', 'SPECIALIST');
insert into aid_worker (aid_worker_name, aid_worker_webb_address, aid_worker_types) values ('InspiratieLoods', 'http://www.inspiratie-loods.nl', 'SPECIALIST');

/*insert into problem (problem_name, problem_types) values ('Self-confidence', 'EMOTIONALPROBLEMS');
insert into problem (problem_name, problem_types) values ('Stressed-out', 'EMOTIONALPROBLEMS');
insert into problem (problem_name, problem_types) values ('Worry-about','EMOTIONALPROBLEMS' );
insert into problem (problem_name, problem_types) values ('Guilty-feelings', 'EMOTIONALPROBLEMS');
insert into problem (problem_name, problem_types) values ('Loneliness', 'EMOTIONALPROBLEMS');
insert into problem (problem_name, problem_types) values ('Fear', 'MENTALHEALTHPROBLEMS');
insert into problem (problem_name, problem_types) values ('Panic', 'MENTALHEALTHPROBLEMS');
insert into problem (problem_name, problem_types) values ('Depression', 'MENTALHEALTHPROBLEMS');
insert into problem (problem_name, problem_types) values ('Addiction', 'MENTALHEALTHPROBLEMS');
insert into problem (problem_name, problem_types) values ('Burnout', 'MENTALHEALTHPROBLEMS');
insert into problem (problem_name, problem_types) values ('Suicide', 'MENTALHEALTHPROBLEMS');
insert into problem (problem_name, problem_types) values ('Abdominal-pains', 'PHYSICALCOMPLAINTS');
insert into problem (problem_name, problem_types) values ('Headache', 'PHYSICALCOMPLAINTS');
insert into problem (problem_name, problem_types) values ('Constant-tiredness', 'PHYSICALCOMPLAINTS');
insert into problem (problem_name, problem_types) values ('Palpitations', 'PHYSICALCOMPLAINTS');
insert into problem (problem_name, problem_types) values ('Intestinal-complains','PHYSICALCOMPLAINTS' );
insert into problem (problem_name, problem_types) values ('Sore-muscles-and-joints', 'PHYSICALCOMPLAINTS');
insert into problem (problem_name, problem_types) values ('Domestic-violence', 'PHYSICALVIOLENCE');
insert into problem (problem_name, problem_types) values ('Child-abuse', 'PHYSICALVIOLENCE');
insert into problem (problem_name, problem_types) values ('Violence', 'PHYSICALVIOLENCE');*/

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

insert into take_action (take_action_types) values ('TESTING');
insert into take_action (take_action_types) values ('ACTIVITIES');
insert into take_action (take_action_types) values ('RESEARCHINFORMATION');
insert into take_action (take_action_types) values ('CANDOITYOURSELF');

insert into treatment (treatment_types) values ('THERAPY');
insert into treatment (treatment_types) values ('CLINICS');
insert into treatment (treatment_types) values ('COACHING');

insert into media_information (media_types) values ('YOUTUBE');
insert into media_information (media_types) values ('COMMUNITIES');
insert into media_information (media_types) values ('VIDEO');
insert into media_information (media_types) values ('TWITTER');
insert into media_information (media_types) values ('FACEBOOK');
insert into media_information (media_types) values ('FORUM');

/*insert into media_option (media_option_name) values ('ChatOption');
insert into media_option (media_option_name) values ('WhatsappOption');
insert into media_option (media_option_name) values ('TwitterOption');
insert into media_option (media_option_name) values ('FacebookOption');
insert into media_option (media_option_name) values ('YoutubeOption');
insert into media_option (media_option_name) values ('VideoOption');
insert into media_option (media_option_name) values ('CommunitiesOption');
insert into media_option (media_option_name) values ('Forum');*/

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
