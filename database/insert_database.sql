insert into role(code,name) values('ADMIN','Quản trị hệ thống');
insert into role(code,name) values('USER','Nhân viên');
insert into role(code,name) values('MANAGER','Quản lý');

insert into users(username,password,fullname)
values('admin','$2a$10$7iZNnduBtl4Eo8IHivGTPucjnERcNnbdbyBONFqu3Zc/TjgajPSS2','admin');
insert into users(username,password,fullname)
values('user','$2a$10$7iZNnduBtl4Eo8IHivGTPucjnERcNnbdbyBONFqu3Zc/TjgajPSS2','user');
insert into users(username,password,fullname)
values('manager','$2a$10$7iZNnduBtl4Eo8IHivGTPucjnERcNnbdbyBONFqu3Zc/TjgajPSS2','manager');
insert into users(username,password,fullname)
values('test1','$2a$10$7iZNnduBtl4Eo8IHivGTPucjnERcNnbdbyBONFqu3Zc/TjgajPSS2','test1');
insert into users(username,password,fullname)
values('test2','$2a$10$7iZNnduBtl4Eo8IHivGTPucjnERcNnbdbyBONFqu3Zc/TjgajPSS2','test2');
insert into users(username,password,fullname)
values('test3','$2a$10$7iZNnduBtl4Eo8IHivGTPucjnERcNnbdbyBONFqu3Zc/TjgajPSS2','test3');
insert into users(username,password,fullname)
values('test4','$2a$10$7iZNnduBtl4Eo8IHivGTPucjnERcNnbdbyBONFqu3Zc/TjgajPSS2','test4');

INSERT INTO user_role(user_id,role_id) VALUES (1,1);
INSERT INTO user_role(user_id,role_id) VALUES (2,2);
INSERT INTO user_role(user_id,role_id) VALUES (3,3);
INSERT INTO user_role(user_id,role_id) VALUES (4,2);
INSERT INTO user_role(user_id,role_id) VALUES (5,2);
INSERT INTO user_role(user_id,role_id) VALUES (6,2);
INSERT INTO user_role(user_id,role_id) VALUES (7,2);