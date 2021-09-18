drop database if exists sabelotodo;
create schema sabelotodo;
use sabelotodo;

create table category(
IdCategory int primary key auto_increment,
categoryName varchar(50) not null
);

create table questions(
IdQuestion int primary key auto_increment,
question varchar(250) not null,
IdCategory int references category(IdCategory)
);

create table answers(
answer varchar(250) not null,
IdQuestion int references questions(IdQuestion),
correct varchar(5) not null
);

create table points(
IdUser int primary key auto_increment,
userName varchar(30) null default "Jugador",
userPoints int not null
);

insert into category(categoryName) values ("Nivel 1: Muy Fácil");
insert into category(categoryName) values ("Nivel 2: Fácil");
insert into category(categoryName) values ("Nivel 3: Intermedio");
insert into category(categoryName) values ("Nivel 4: Difícil");
insert into category(categoryName) values ("Nivel 5: Muy Difícil");

insert into questions(question, IdCategory) values ("¿Quién es el escritor del libro 'Don Quijote de la Mancha'?", 1);
insert into questions(question, IdCategory) values ("¿Cómo se llama el proceso por el que las plantas extraen energía de la luz solar?", 1);
insert into questions(question, IdCategory) values ("Cuál es el sexto (6) planeta del sistema solar?", 1);
insert into questions(question, IdCategory) values ("El keroseno es un derivado de:", 1);
insert into questions(question, IdCategory) values ("¿Cómo se llama una palabra con la sílaba tónica en la última sílaba?", 1);

insert into questions(question, IdCategory) values ("¿Cuántos años tiene un lustro?", 2);
insert into questions(question, IdCategory) values ("El número romano CMLV equivale a:", 2);
insert into questions(question, IdCategory) values ("¿Dónde originaron los juegos olímpicos?", 2);
insert into questions(question, IdCategory) values ("¿Cuántos huesos hay en el cuerpo de un humano adulto?", 2);
insert into questions(question, IdCategory) values ("¿Cuál fue el primer metal que empleó el hombre?", 2);

insert into questions(question, IdCategory) values ("¿Cuál es el único mamífero capaz de volar?", 3);
insert into questions(question, IdCategory) values ("¿A qué país pertenece la ciudad de Varsovia?", 3);
insert into questions(question, IdCategory) values ("¿Quién compuso la mítica canción 'Knockin’ on Heaven’s Door'?", 3);
insert into questions(question, IdCategory) values ("¿Quién inventó la imprenta?", 3);
insert into questions(question, IdCategory) values ("¿Cuál es el océano más grande del mundo?", 3);

insert into questions(question, IdCategory) values ("¿En qué año llegó el ser humano a la Luna?", 4);
insert into questions(question, IdCategory) values ("¿Cuántas teclas tiene un piano?", 4);
insert into questions(question, IdCategory) values ("¿Quién fue el padre de la bomba atómica?", 4);
insert into questions(question, IdCategory) values ("¿Qué país tiene más islas en el mundo?", 4);
insert into questions(question, IdCategory) values ("¿Quién fue la primera mujer según la mitología griega?", 4);

insert into questions(question, IdCategory) values ("¿Cuál fue la primera civilización humana?", 5);
insert into questions(question, IdCategory) values ("¿Dónde están ubicados los huesos escafoides?", 5);
insert into questions(question, IdCategory) values ("¿Qué tipo de roca es la serpentinita?", 5);
insert into questions(question, IdCategory) values ("¿Cuál es la flor nacional de Japón?", 5);
insert into questions(question, IdCategory) values ("¿Qué representaba el dios Thot en el antiguo Egipto?", 5);

insert into answers(answer, IdQuestion, correct) values ("Miguel de cervantes",1, "si");
insert into answers(answer, IdQuestion, correct) values ("Jorge Luis Borges",1, "no");
insert into answers(answer, IdQuestion, correct) values ("Gabriel García Márquez",1, "no");
insert into answers(answer, IdQuestion, correct) values ("Julio Cortázar",1, "no");

insert into answers(answer, IdQuestion, correct) values ("Respiración",2, "no");
insert into answers(answer, IdQuestion, correct) values ("Fotosíntesis",2, "si");
insert into answers(answer, IdQuestion, correct) values ("Fototropismo",2, "no");
insert into answers(answer, IdQuestion, correct) values ("Fotorecepción",2, "no");

insert into answers(answer, IdQuestion, correct) values ("Saturno",3, "si");
insert into answers(answer, IdQuestion, correct) values ("Urano",3, "no");
insert into answers(answer, IdQuestion, correct) values ("Júpiter",3, "no");
insert into answers(answer, IdQuestion, correct) values ("Neptuno",3, "no");

insert into answers(answer, IdQuestion, correct) values ("Petróleo",4, "si");
insert into answers(answer, IdQuestion, correct) values ("Caña de azúcar",4, "no");
insert into answers(answer, IdQuestion, correct) values ("Madera",4, "no");
insert into answers(answer, IdQuestion, correct) values ("Leche",4, "no");

insert into answers(answer, IdQuestion, correct) values ("Aguda",5, "no");
insert into answers(answer, IdQuestion, correct) values ("Grave",5, "si");
insert into answers(answer, IdQuestion, correct) values ("Esdrújula",5, "no");
insert into answers(answer, IdQuestion, correct) values ("Sobreesdrújula",5, "no");

insert into answers(answer, IdQuestion, correct) values ("1",6, "no");
insert into answers(answer, IdQuestion, correct) values ("5",6, "si");
insert into answers(answer, IdQuestion, correct) values ("10",6, "no");
insert into answers(answer, IdQuestion, correct) values ("50",6, "no");

insert into answers(answer, IdQuestion, correct) values ("100 505",7, "no");
insert into answers(answer, IdQuestion, correct) values ("1155",7, "no");
insert into answers(answer, IdQuestion, correct) values ("955",7, "si");
insert into answers(answer, IdQuestion, correct) values ("150",7, "no");

insert into answers(answer, IdQuestion, correct) values ("Inglaterra",8, "no");
insert into answers(answer, IdQuestion, correct) values ("China",8, "no");
insert into answers(answer, IdQuestion, correct) values ("Estados Unidos",8, "no");
insert into answers(answer, IdQuestion, correct) values ("Grecia",8, "si");

insert into answers(answer, IdQuestion, correct) values ("206",9, "si");
insert into answers(answer, IdQuestion, correct) values ("196",9, "no");
insert into answers(answer, IdQuestion, correct) values ("203",9, "no");
insert into answers(answer, IdQuestion, correct) values ("303",9, "no");

insert into answers(answer, IdQuestion, correct) values ("Hierro",10, "no");
insert into answers(answer, IdQuestion, correct) values ("Cobre",10, "si");
insert into answers(answer, IdQuestion, correct) values ("Plata",10, "no");
insert into answers(answer, IdQuestion, correct) values ("Acero",10, "no");

insert into answers(answer, IdQuestion, correct) values ("Flamenco",11, "no");
insert into answers(answer, IdQuestion, correct) values ("Ardilla voladora",11, "no");
insert into answers(answer, IdQuestion, correct) values ("Marsupial",11, "no");
insert into answers(answer, IdQuestion, correct) values ("Murciélago",11, "si");

insert into answers(answer, IdQuestion, correct) values ("Ucrania",12, "no");
insert into answers(answer, IdQuestion, correct) values ("Moldavia",12, "no");
insert into answers(answer, IdQuestion, correct) values ("Polonia",12, "si");
insert into answers(answer, IdQuestion, correct) values ("Bielorrusia",12, "no");

insert into answers(answer, IdQuestion, correct) values ("Guns and Roses",13, "no");
insert into answers(answer, IdQuestion, correct) values ("Avril Lavigne",13, "no");
insert into answers(answer, IdQuestion, correct) values ("Bob dylan",13, "si");
insert into answers(answer, IdQuestion, correct) values ("Eric Clapton",13, "no");

insert into answers(answer, IdQuestion, correct) values ("Thomas Alva Edison",14, "no");
insert into answers(answer, IdQuestion, correct) values ("Johannes Gutenberg ",14, "si");
insert into answers(answer, IdQuestion, correct) values ("Louis Lumière",14, "no");
insert into answers(answer, IdQuestion, correct) values ("Alexander Graham Bell",14, "no");

insert into answers(answer, IdQuestion, correct) values ("Atlántico",15, "no");
insert into answers(answer, IdQuestion, correct) values ("Índico",15, "no");
insert into answers(answer, IdQuestion, correct) values ("Ártico",15, "no");
insert into answers(answer, IdQuestion, correct) values ("Pacífico",15, "si");

insert into answers(answer, IdQuestion, correct) values ("1960",16, "no");
insert into answers(answer, IdQuestion, correct) values ("1969",16, "si");
insert into answers(answer, IdQuestion, correct) values ("1971",16, "no");
insert into answers(answer, IdQuestion, correct) values ("1986",16, "no");

insert into answers(answer, IdQuestion, correct) values ("88",17, "si");
insert into answers(answer, IdQuestion, correct) values ("95",17, "no");
insert into answers(answer, IdQuestion, correct) values ("61",17, "no");
insert into answers(answer, IdQuestion, correct) values ("73",17, "no");

insert into answers(answer, IdQuestion, correct) values ("Franklin Roosevelt",18, "no");
insert into answers(answer, IdQuestion, correct) values ("Robert Oppenheimer",18, "si");
insert into answers(answer, IdQuestion, correct) values ("Edward Teller",18, "no");
insert into answers(answer, IdQuestion, correct) values ("Albert Einstein",18, "no");

insert into answers(answer, IdQuestion, correct) values ("Noruega",19, "no");
insert into answers(answer, IdQuestion, correct) values ("Indonesia",19, "no");
insert into answers(answer, IdQuestion, correct) values ("Australia",19, "no");
insert into answers(answer, IdQuestion, correct) values ("Suecia",19, "si");

insert into answers(answer, IdQuestion, correct) values ("Gea",20, "no");
insert into answers(answer, IdQuestion, correct) values ("Pandora",20, "si");
insert into answers(answer, IdQuestion, correct) values ("Afrodita",20, "no");
insert into answers(answer, IdQuestion, correct) values ("Psique",20, "no");

insert into answers(answer, IdQuestion, correct) values ("Sumeria",21, "si");
insert into answers(answer, IdQuestion, correct) values ("Egipcia",21, "no");
insert into answers(answer, IdQuestion, correct) values ("Babilónica",21, "no");
insert into answers(answer, IdQuestion, correct) values ("China",21, "no");

insert into answers(answer, IdQuestion, correct) values ("Rodilla",22, "no");
insert into answers(answer, IdQuestion, correct) values ("Muñeca",22, "si");
insert into answers(answer, IdQuestion, correct) values ("Cráneo",22, "no");
insert into answers(answer, IdQuestion, correct) values ("Cadera",22, "no");

insert into answers(answer, IdQuestion, correct) values ("Ígnea",23, "no");
insert into answers(answer, IdQuestion, correct) values ("Sedimentária",23, "no");
insert into answers(answer, IdQuestion, correct) values ("Metamórfica",23, "si");
insert into answers(answer, IdQuestion, correct) values ("Meteorito",23, "no");

insert into answers(answer, IdQuestion, correct) values ("Melocotón",24, "no");
insert into answers(answer, IdQuestion, correct) values ("Violeta",24, "no");
insert into answers(answer, IdQuestion, correct) values ("Crisantemo",24, "no");
insert into answers(answer, IdQuestion, correct) values ("Cerezo",24, "si");

insert into answers(answer, IdQuestion, correct) values ("Sol",25, "no");
insert into answers(answer, IdQuestion, correct) values ("Cielo",25, "no");
insert into answers(answer, IdQuestion, correct) values ("Sabiduría",25, "si");
insert into answers(answer, IdQuestion, correct) values ("Desierto",25, "no");