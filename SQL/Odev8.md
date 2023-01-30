# Ödev8

1) test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

~~~sql
CREATE TABLE employee (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50),
	birthday DATE,
	email VARCHAR(100)
)
~~~

2) Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

~~~sql
insert into employee (name, birthday, email) values ('Bary Girhard', null, 'bgirhard0@purevolume.com');
insert into employee (name, birthday, email) values ('Nicko Bigmore', '1977-07-26', 'nbigmore1@joomla.org');
insert into employee (name, birthday, email) values ('Zack Deal', '1983-12-16', 'zdeal2@digg.com');
insert into employee (name, birthday, email) values ('Bart Denkin', '1966-12-13', 'bdenkin3@acquirethisname.com');
insert into employee (name, birthday, email) values ('Doy Robottham', '1989-12-25', 'drobottham4@prnewswire.com');
insert into employee (name, birthday, email) values ('Keven Rosenblath', '1957-10-11', 'krosenblath5@zdnet.com');
insert into employee (name, birthday, email) values ('Adel Veltmann', '1986-04-16', 'aveltmann6@goo.gl');
insert into employee (name, birthday, email) values ('Krysta McTeggart', '1990-12-02', 'kmcteggart7@latimes.com');
insert into employee (name, birthday, email) values ('Alfonse Lowton', '1976-03-21', 'alowton8@linkedin.com');
insert into employee (name, birthday, email) values ('Yvor Maddern', '1970-03-16', 'ymaddern9@imgur.com');
insert into employee (name, birthday, email) values ('David Fedynski', '1999-09-15', 'dfedynskia@tinypic.com');
insert into employee (name, birthday, email) values ('Jacinta Faithorn', '1984-04-28', 'jfaithornb@cbslocal.com');
insert into employee (name, birthday, email) values ('Elaina Cammack', '1953-07-25', 'ecammackc@skype.com');
insert into employee (name, birthday, email) values ('Wes Lockett', '1981-03-09', 'wlockettd@goo.gl');
insert into employee (name, birthday, email) values ('Gale Gillinghams', '2000-06-16', 'ggillinghamse@fema.gov');
insert into employee (name, birthday, email) values ('Ronnie Bonnavant', '1972-03-06', 'rbonnavantf@cbslocal.com');
insert into employee (name, birthday, email) values ('Sari Weems', '1993-03-03', 'sweemsg@technorati.com');
insert into employee (name, birthday, email) values ('Dru Duxbury', '1986-10-31', 'dduxburyh@hhs.gov');
insert into employee (name, birthday, email) values ('Clementine Brazenor', '2000-07-05', 'cbrazenori@miitbeian.gov.cn');
insert into employee (name, birthday, email) values ('Gottfried Killingbeck', '2000-03-27', 'gkillingbeckj@opensource.org');
insert into employee (name, birthday, email) values ('Tiffi Sturman', null, 'tsturmank@homestead.com');
insert into employee (name, birthday, email) values ('Zachary Laingmaid', '1985-05-01', 'zlaingmaidl@vistaprint.com');
insert into employee (name, birthday, email) values ('Gusti Rudeyeard', '1963-09-08', 'grudeyeardm@dropbox.com');
insert into employee (name, birthday, email) values ('Tildie Newlands', '1990-05-02', 'tnewlandsn@blog.com');
insert into employee (name, birthday, email) values ('Angel Gibbard', '1991-01-18', 'agibbardo@businessinsider.com');
insert into employee (name, birthday, email) values ('Marieann Bunworth', '1964-06-25', 'mbunworthp@diigo.com');
insert into employee (name, birthday, email) values ('Gaby Bridywater', '1956-03-23', 'gbridywaterq@simplemachines.org');
insert into employee (name, birthday, email) values ('Elmore Newiss', '1976-05-17', 'enewissr@multiply.com');
insert into employee (name, birthday, email) values ('Gerry Farr', null, 'gfarrs@squarespace.com');
insert into employee (name, birthday, email) values ('Nerte Dottridge', '1991-07-02', 'ndottridget@samsung.com');
insert into employee (name, birthday, email) values ('Vivien Lively', '1955-12-07', 'vlivelyu@spiegel.de');
insert into employee (name, birthday, email) values ('Minny Randles', '1973-01-13', 'mrandlesv@scribd.com');
insert into employee (name, birthday, email) values ('Tally Hassard', '1970-05-04', 'thassardw@google.de');
insert into employee (name, birthday, email) values ('Silvia Clemenzo', '2000-02-19', 'sclemenzox@theglobeandmail.com');
insert into employee (name, birthday, email) values ('Aldus Brahms', '1950-08-22', 'abrahmsy@purevolume.com');
insert into employee (name, birthday, email) values ('Lolly Pelham', '1955-05-30', 'lpelhamz@moonfruit.com');
insert into employee (name, birthday, email) values ('Teressa Staig', '1967-11-11', 'tstaig10@photobucket.com');
insert into employee (name, birthday, email) values ('Nydia Charer', '1977-09-16', 'ncharer11@umn.edu');
insert into employee (name, birthday, email) values ('Martyn Sapwell', '1983-03-07', 'msapwell12@over-blog.com');
insert into employee (name, birthday, email) values ('Lesley Goulthorp', '1950-06-26', 'lgoulthorp13@dailymail.co.uk');
insert into employee (name, birthday, email) values ('Ally Veelers', '1990-07-11', 'aveelers14@diigo.com');
insert into employee (name, birthday, email) values ('Godart McVey', '1992-06-28', 'gmcvey15@usnews.com');
insert into employee (name, birthday, email) values ('Constantine Dudman', '1980-01-03', 'cdudman16@nature.com');
insert into employee (name, birthday, email) values ('Francisco Siret', '1969-10-07', 'fsiret17@google.cn');
insert into employee (name, birthday, email) values ('Griffin Milleton', '1987-03-10', 'gmilleton18@ifeng.com');
insert into employee (name, birthday, email) values ('Lucais Napoli', '1996-01-17', 'lnapoli19@chron.com');
insert into employee (name, birthday, email) values ('Averill Cardon', '1954-01-01', 'acardon1a@aol.com');
insert into employee (name, birthday, email) values ('Bogart McCafferty', '1987-09-13', 'bmccafferty1b@state.gov');
insert into employee (name, birthday, email) values ('Gretal Breeds', '1995-09-02', 'gbreeds1c@ustream.tv');
insert into employee (name, birthday, email) values ('Peder Thirsk', '1993-11-29', 'pthirsk1d@bloglines.com');
~~~


3) Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

~~~sql
UPDATE employee
SET name = 'ASK'
WHERE id = 4
--------------------------
UPDATE employee
SET name = 'XXXXXXXX'
WHERE name LIKE 'G%'
--------------------------
UPDATE employee
SET email = null
WHERE email ILIKE 'a%'
~~~

4) Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

~~~sql
DELETE FROM employee
WHERE name LIKE '%n'
--------------------------
DELETE FROM employee
WHERE email ILIKE 'lna%'
~~~