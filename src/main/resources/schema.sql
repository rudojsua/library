create table book(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  author VARCHAR(100) NOT NULL,
  title VARCHAR(300) NOT NULL,
  data INT NOT NULL,
  pages INT NOT NULL,
  languages VARCHAR(50) NOT NULL,
  sizes INT,
  extension VARCHAR(50) NOT NULL
);

