insert into seguridad.rol values (1, TRUE, 'administrador');
insert into seguridad.rol values (2, TRUE, 'editor');
insert into seguridad.rol values (3, TRUE, 'usuario');
select setval('seguridad.sequence_rol', 3, TRUE);

insert into seguridad.usuario values (1, 'admin', TRUE, null, null, 'admin', null, null);
insert into seguridad.usuario values (2, 'editor', TRUE, null, null, 'editor', null, null);
insert into seguridad.usuario values (3, 'user', TRUE, null, null, 'user', null, null);
select setval('seguridad.sequence_usuario', 3, TRUE);
	
insert into seguridad.usuario_rol values (1, 1);
insert into seguridad.usuario_rol values (2, 2);
insert into seguridad.usuario_rol values (3, 3);

insert into noticia values ( 1,'1111111111111111111111111',TRUE,'2016-09-19 13:59:59.522','2016-09-19 13:59:59.522','123456','1111111111111111111','usuario','admin');
insert into noticia values ( 2,'2222222222222222222222222',TRUE,'2016-09-19 14:00:03.789','2016-09-19 14:00:03.789','123456','2222222222222222222','usuario','admin');
insert into noticia values ( 3,'3333333333333333333333333',TRUE,'2016-09-19 14:00:07.158','2016-09-19 14:00:07.158','123456','3333333333333333333','usuario','admin');
insert into noticia values ( 4,'4444444444444444444444444',TRUE,'2016-09-19 14:00:11.127','2016-09-19 14:00:11.127','123456','4444444444444444444','usuario','admin');
insert into noticia values ( 5,'5555555555555555555555555',TRUE,'2016-09-19 14:00:14.652','2016-09-19 14:00:14.652','123456','5555555555555555555','usuario','admin');
insert into noticia values ( 6,'6666666666666666666666666',TRUE,'2016-09-19 14:00:17.959','2016-09-19 14:00:17.959','123456','6666666666666666666','usuario','admin');
insert into noticia values ( 7,'7777777777777777777777777',TRUE,'2016-09-19 14:00:21.108','2016-09-19 14:00:21.180','123456','7777777777777777777','usuario','admin');
insert into noticia values ( 8,'8888888888888888888888888',TRUE,'2016-09-19 14:00:24.659','2016-09-19 14:00:24.659','123456','8888888888888888888','usuario','admin');
insert into noticia values ( 9,'9999999999999999999999999',TRUE,'2016-09-19 14:00:27.899','2016-09-19 14:00:27.899','123456','9999999999999999999','usuario','admin');
insert into noticia values (10,'ddddddddddddddddddddddddd',TRUE,'2016-09-19 14:00:37.269','2016-09-19 14:00:37.269','123456','ddddddddddddddddddd','usuario','admin');
insert into noticia values (11,'ooooooooooooooooooooooooo',TRUE,'2016-09-19 14:00:41.624','2016-09-19 14:00:41.624','123456','ooooooooooooooooooo','usuario','admin');
insert into noticia values (12,'ddddddddddddddddddddddddd',TRUE,'2016-09-19 14:00:46.798','2016-09-19 14:00:46.798','123456','ddddddddddddddddddd','usuario','admin');
insert into noticia values (13,'ttttttttttttttttttttttttt',TRUE,'2016-09-19 14:00:50.979','2016-09-19 14:00:50.979','123456','ttttttttttttttttttt','usuario','admin');
insert into noticia values (14,'ccccccccccccccccccccccccc',TRUE,'2016-09-19 14:00:56.938','2016-09-19 14:00:56.938','123456','ccccccccccccccccccc','usuario','admin');
insert into noticia values (15,'qqqqqqqqqqqqqqqqqqqqqqqqq',TRUE,'2016-09-19 14:01:01.157','2016-09-19 14:01:01.157','123456','qqqqqqqqqqqqqqqqqqq','usuario','admin');
insert into noticia values (16,'ddddddddddddddddddddddddd',TRUE,'2016-09-19 14:01:06.004','2016-09-19 14:01:06.004','123456','ddddddddddddddddddd','usuario','admin');
insert into noticia values (17,'ddddddddddddddddddddddddd',TRUE,'2016-09-19 14:01:11.795','2016-09-19 14:01:11.795','123456','ddddddddddddddddddd','usuario','admin');
insert into noticia values (18,'fffffffffffffffffffffffff',TRUE,'2016-09-19 14:01:15.867','2016-09-19 14:01:15.867','123456','fffffffffffffffffff','usuario','admin');
insert into noticia values (19,'9999999999999999999999999',TRUE,'2016-09-19 14:01:20.034','2016-09-19 14:01:20.034','123456','9999999999999999999','usuario','admin');
insert into noticia values (20,'0000000000000000000000000',TRUE,'2016-09-21 10:59:04.705','2016-09-19 14:01:25.298','123456','0000000000000000000','usuario','admin');
select setval('public.sequence_noticia', 20, TRUE);