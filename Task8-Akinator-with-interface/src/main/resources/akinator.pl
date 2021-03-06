read_str(A):-get0(X),r_str(X,A,[]).
r_str(10,A,A):-!.
r_str(X,A,B):-append(B,[X],B1),get0(X1),r_str(X1,A,B1).

q01('E:/My_Progs/knowlage-base/Task8-Akinator-with-interface/src/main/resources/q1.txt').
q02('E:/My_Progs/knowlage-base/Task8-Akinator-with-interface/src/main/resources/q2.txt').
q04('E:/My_Progs/knowlage-base/Task8-Akinator-with-interface/src/main/resources/q4.txt').
q05('E:/My_Progs/knowlage-base/Task8-Akinator-with-interface/src/main/resources/q5.txt').
q06('E:/My_Progs/knowlage-base/Task8-Akinator-with-interface/src/main/resources/q6.txt').
q07('E:/My_Progs/knowlage-base/Task8-Akinator-with-interface/src/main/resources/q7.txt').
q08('E:/My_Progs/knowlage-base/Task8-Akinator-with-interface/src/main/resources/q8.txt').
q09('E:/My_Progs/knowlage-base/Task8-Akinator-with-interface/src/main/resources/q9.txt').
q10('E:/My_Progs/knowlage-base/Task8-Akinator-with-interface/src/main/resources/q10.txt').
q11('E:/My_Progs/knowlage-base/Task8-Akinator-with-interface/src/main/resources/q11.txt').

% =============================================================================
%Question 1
:- dynamic q1/2.

write_q1(X,Y):-
    repeat,
    (q1(X,Y) -> (
         nl,
         write(X),
         nl,
         write(Y),
         write("."),
         retract(q1(X,Y)));
    X=nil,
    Y=nil).

read_q1(-1):-!.
read_q1(_):-
    read_str(Lang),
    name(X,Lang),
    read(Y),
    asserta(q1(X,Y)),
    get0(Sym),
    read_q1(Sym).


save_q1(File):-
    tell(File),
    write_q1(X,_),
    X=nil,
    told.

load_q1(File):-
    see(File),
    get0(Sym),
    read_q1(Sym),
    seen.

question1(X1):-
    write("Какого пола ваш персонаж? "),nl,
    write("1. Мужской"),nl,
    write("2. Женский"),nl,
    write("3. Другой"),nl,
    read(X1).


% =============================================================================
%Question 2
:- dynamic q2/2.

write_q2(X,Y):-
    repeat,
    (q2(X,Y) -> (
         nl,
         write(X),
         nl,
         write(Y),
         write("."),
         retract(q2(X,Y)));
    X=nil,
    Y=nil).

read_q2(-1):-!.
read_q2(_):-
    read_str(Lang),
    name(X,Lang),
    read(Y),
    asserta(q2(X,Y)),
    get0(Sym),
    read_q2(Sym).


save_q2(File):-
    tell(File),
    write_q2(X,_),
    X=nil,
    told.

load_q2(File):-
    see(File),
    get0(Sym),
    read_q2(Sym),
    seen.


question2(X2):-
    write("Ваш персонаж человек?"),nl,
    write("1. Да"),nl,
    write("2. Нет"),nl,
    write("3. Не знаю"),nl,
    read(X2).


% =============================================================================
%Question 4
:- dynamic q4/2.

write_q4(X,Y):-
    repeat,
    (q4(X,Y) -> (
         nl,
         write(X),
         nl,
         write(Y),
         write("."),
         retract(q4(X,Y)));
    X=nil,
    Y=nil).

read_q4(-1):-!.
read_q4(_):-
    read_str(Lang),
    name(X,Lang),
    read(Y),
    asserta(q4(X,Y)),
    get0(Sym),
    read_q4(Sym).


save_q4(File):-
    tell(File),
    write_q4(X,_),
    X=nil,
    told.

load_q4(File):-
    see(File),
    get0(Sym),
    read_q4(Sym),
    seen.


question4(X4):-
    write("Ваш персонаж умеет летать?"),nl,
    write("1. Да"),nl,
    write("2. Нет"),nl,
    write("3. Не знаю"),nl,
    read(X4).


% =============================================================================
%Question 5
:- dynamic q5/2.

write_q5(X,Y):-
    repeat,
    (q5(X,Y) -> (
         nl,
         write(X),
         nl,
         write(Y),
         write("."),
         retract(q5(X,Y)));
    X=nil,
    Y=nil).

read_q5(-1):-!.
read_q5(_):-
    read_str(Lang),
    name(X,Lang),
    read(Y),
    asserta(q5(X,Y)),
    get0(Sym),
    read_q5(Sym).


save_q5(File):-
    tell(File),
    write_q5(X,_),
    X=nil,
    told.

load_q5(File):-
    see(File),
    get0(Sym),
    read_q5(Sym),
    seen.


question5(X5):-
    write("Ваш персонаж владеет магией?"),nl,
    write("1. Да"),nl,
    write("2. Нет"),nl,
    write("3. Не знаю"),nl,
    read(X5).


% =============================================================================
%Question 6
:- dynamic q6/2.

write_q6(X,Y):-
    repeat,
    (q6(X,Y) -> (
         nl,
         write(X),
         nl,
         write(Y),
         write("."),
         retract(q6(X,Y)));
    X=nil,
    Y=nil).

read_q6(-1):-!.
read_q6(_):-
    read_str(Lang),
    name(X,Lang),
    read(Y),
    asserta(q6(X,Y)),
    get0(Sym),
    read_q6(Sym).


save_q6(File):-
    tell(File),
    write_q6(X,_),
    X=nil,
    told.

load_q6(File):-
    see(File),
    get0(Sym),
    read_q6(Sym),
    seen.


question6(X6):-
    write("Владеет ли ваш персонаж боевыми искусствами?"),nl,
    write("1. Да"),nl,
    write("2. Нет"),nl,
    write("3. Не знаю"),nl,
    read(X6).


% =============================================================================
%Question 7
:- dynamic q7/2.

write_q7(X,Y):-
    repeat,
    (q7(X,Y) -> (
         nl,
         write(X),
         nl,
         write(Y),
         write("."),
         retract(q7(X,Y)));
    X=nil,
    Y=nil).

read_q7(-1):-!.
read_q7(_):-
    read_str(Lang),
    name(X,Lang),
    read(Y),
    asserta(q7(X,Y)),
    get0(Sym),
    read_q7(Sym).


save_q7(File):-
    tell(File),
    write_q7(X,_),
    X=nil,
    told.

load_q7(File):-
    see(File),
    get0(Sym),
    read_q7(Sym),
    seen.


question7(X7):-
    write("У вашего персонажа четыре руки? "),nl,
    write("1. Да"),nl,
    write("2. Нет"),nl,
    read(X7).


% =============================================================================
%Question 8
:- dynamic q8/2.

write_q8(X,Y):-
    repeat,
    (q8(X,Y) -> (
         nl,
         write(X),
         nl,
         write(Y),
         write("."),
         retract(q8(X,Y)));
    X=nil,
    Y=nil).

read_q8(-1):-!.
read_q8(_):-
    read_str(Lang),
    name(X,Lang),
    read(Y),
    asserta(q8(X,Y)),
    get0(Sym),
    read_q8(Sym).


save_q8(File):-
    tell(File),
    write_q8(X,_),
    X=nil,
    told.

load_q8(File):-
    see(File),
    get0(Sym),
    read_q8(Sym),
    seen.


question8(X8):-
    write("Сколько лет вашему персонажу? "),nl,
    write("1. Меньше 30 лет"),nl,
    write("2. Mеньше 55 лет"),nl,
    write("3. Больше 55 ле"),nl,
    write("4. Да"),nl,
    write("5. Не знаю"),nl,
    read(X8).


% =============================================================================
%Question 9
:- dynamic q9/2.

write_q9(X,Y):-
    repeat,
    (q9(X,Y) -> (
         nl,
         write(X),
         nl,
         write(Y),
         write("."),
         retract(q9(X,Y)));
    X=nil,
    Y=nil).

read_q9(-1):-!.
read_q9(_):-
    read_str(Lang),
    name(X,Lang),
    read(Y),
    asserta(q9(X,Y)),
    get0(Sym),
    read_q9(Sym).


save_q9(File):-
    tell(File),
    write_q9(X,_),
    X=nil,
    told.

load_q9(File):-
    see(File),
    get0(Sym),
    read_q9(Sym),
    seen.


question9(X9):-
    write("Ваш персонаж из DLC?"),nl,
    write("1. Да"),nl,
    write("2. Нет"),nl,
    read(X9).


% =============================================================================
%Question 10
:- dynamic q10/2.

write_q10(X,Y):-
    repeat,
    (q10(X,Y) -> (
         nl,
         write(X),
         nl,
         write(Y),
         write("."),
         retract(q10(X,Y)));
    X=nil,
    Y=nil).

read_q10(-1):-!.
read_q10(_):-
    read_str(Lang),
    name(X,Lang),
    read(Y),
    asserta(q10(X,Y)),
    get0(Sym),
    read_q10(Sym).


save_q10(File):-
    tell(File),
    write_q10(X,_),
    X=nil,
    told.

load_q10(File):-
    see(File),
    get0(Sym),
    read_q10(Sym),
    seen.


question10(X10):-
    write("Пользуется ли Ваш персонаж оружием?"),nl,
    write("1. Да"),nl,
    write("2. Нет"),nl,
    read(X10).


% =============================================================================
%Question 11
:- dynamic q11/2.

write_q11(X,Y):-
    repeat,
    (q11(X,Y) -> (
         nl,
         write(X),
         nl,
         write(Y),
         write("."),
         retract(q11(X,Y)));
    X=nil,
    Y=nil).

read_q11(-1):-!.
read_q11(_):-
    read_str(Lang),
    name(X,Lang),
    read(Y),
    asserta(q11(X,Y)),
    get0(Sym),
    read_q11(Sym).


save_q11(File):-
    tell(File),
    write_q11(X,_),
    X=nil,
    told.

load_q11(File):-
    see(File),
    get0(Sym),
    read_q11(Sym),
    seen.


question11(X11):-
    write("Какое мировозрение у Вашего персонажа?"),nl,
    write("1. Добро"),nl,
    write("2. Зло"),nl,
    write("3. Нейтральное"),nl,
    write("4. Не знаю"),nl,
    read(X11).


% =============================================================================
%run

load:-
    q01(File1),q02(File2),q04(File4),q05(File5),q06(File6),
    q07(File7),q08(File8),q09(File9),q10(File10),q11(File11),
    load_q1(File1),load_q2(File2),load_q4(File4),load_q5(File5),load_q6(File6),
    load_q7(File7),load_q8(File8),load_q9(File9),load_q10(File10),load_q11(File11).

save:-
    q01(File1),q02(File2),q04(File4),q05(File5),q06(File6),
    q07(File7),q08(File8),q09(File9),q10(File10),q11(File11),
    save_q1(File1),save_q2(File2),save_q4(File4),save_q5(File5),save_q6(File6),
    save_q7(File7),save_q8(File8),save_q9(File9),save_q10(File10),save_q11(File11).

question(X1,X2,X4,X5,X6,X7,X8,X9,X10,X11):-
    question1(X1),question2(X2),question4(X4),question5(X5),
    question6(X6),question7(X7),question8(X8),question9(X9),
    question10(X10),question11(X11),get0(_).

q(X,X1,X2,X4,X5,X6,X7,X8,X9,X10,X11):-
    q1(X,X1),q2(X,X2),q4(X,X4),q5(X,X5),q6(X,X6),
    q7(X,X7),q8(X,X8),q9(X,X9),q10(X,X10),q11(X,X11).

assert(Name,X1,X2,X4,X5,X6,X7,X8,X9,X10,X11):-
    asserta(q1(Name,X1)),asserta(q2(Name,X2)),
    asserta(q4(Name,X4)),asserta(q5(Name,X5)),
    asserta(q6(Name,X6)),asserta(q7(Name,X7)),
    asserta(q8(Name,X8)),asserta(q9(Name,X9)),
    asserta(q10(Name,X10)),asserta(q11(Name,X11)).

run:-
    load,
    question(X1,X2,X4,X5,X6,X7,X8,X9,X10,X11),
    (q(X,X1,X2,X4,X5,X6,X7,X8,X9,X10,X11) ->
    write(X);

    writeln("Write your answer:"),
    read_str(Answer),
    name(Name,Answer),
    assert(Name,X1,X2,X4,X5,X6,X7,X8,X9,X10,X11),
    save).

