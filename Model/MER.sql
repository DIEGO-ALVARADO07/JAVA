CREATE TABLE `dates` (
  `id_date` int(11) PRIMARY KEY NOT NULL,
  `id_user` int(11) DEFAULT null,
  `id_doctor` int(11) DEFAULT null,
  `id_timetable` int(11) DEFAULT null,
  `date_time` datetime NOT NULL,
  `status` ENUM ('pending', 'confirmed', 'cancelled') DEFAULT 'pending',
  `consultation_reason` text DEFAULT null,
  `creation_date` datetime DEFAULT (current_timestamp())
);

CREATE TABLE `specialties` (
  `id_specialty` int(11) PRIMARY KEY NOT NULL,
  `name` varchar(100) NOT NULL
);

CREATE TABLE `timetable` (
  `id_timetable` int(11) PRIMARY KEY NOT NULL,
  `id_doctor` int(11) DEFAULT null,
  `start_time` time NOT NULL,
  `end_time` time NOT NULL,
  `weekday` ENUM ('Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday') NOT NULL
);

CREATE TABLE `users` (
  `id_user` int(11) PRIMARY KEY NOT NULL,
  `first_name` varchar(15) NOT NULL,
  `last_name` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `role` ENUM ('patient', 'doctor', 'admin') NOT NULL,
  `password` varchar(255) NOT NULL,
  `registration_date` datetime DEFAULT (current_timestamp())
);

CREATE TABLE `user_specialty` (
  `id_user_specialty` int(11) PRIMARY KEY NOT NULL,
  `id_user` int(11) NOT NULL,
  `id_specialty` int(11) NOT NULL
);

ALTER TABLE `dates` ADD CONSTRAINT `dates_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `users` (`id_user`) ON DELETE CASCADE;

ALTER TABLE `dates` ADD CONSTRAINT `dates_ibfk_2` FOREIGN KEY (`id_doctor`) REFERENCES `users` (`id_user`) ON DELETE CASCADE;

ALTER TABLE `dates` ADD CONSTRAINT `dates_ibfk_3` FOREIGN KEY (`id_timetable`) REFERENCES `timetable` (`id_timetable`) ON DELETE CASCADE;

ALTER TABLE `timetable` ADD CONSTRAINT `timetable_ibfk_1` FOREIGN KEY (`id_doctor`) REFERENCES `users` (`id_user`) ON DELETE CASCADE;

ALTER TABLE `user_specialty` ADD CONSTRAINT `user_specialty_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `users` (`id_user`) ON DELETE CASCADE;

ALTER TABLE `user_specialty` ADD CONSTRAINT `user_specialty_ibfk_2` FOREIGN KEY (`id_specialty`) REFERENCES `specialties` (`id_specialty`) ON DELETE CASCADE;
