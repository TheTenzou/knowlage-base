:- dynamic q1/2.
:- dynamic q2/2.

read_str(A):-get0(X),r_str(X,A,[]).
r_str(10,A,A):-!.
r_str(X,A,B):-append(B,[X],B1),get0(X1),r_str(X1,A,B1).


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



save_q1:-
    tell('C:/Users/Tenzou/Documents/Prolog/sm/Task7 Akinator/predicats/q1.txt'),
    write_q1(X,_),
    X=nil,
    told.

load_q1:-
    see('C:/Users/Tenzou/Documents/Prolog/sm/Task7 Akinator/predicats/q1.txt'),
    get0(Sym),
    read_q1(Sym),
    seen.


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



save_q2:-
    tell('C:/Users/Tenzou/Documents/Prolog/sm/Task7 Akinator/predicats/q2.txt'),
    write_q2(X,_),
    X=nil,
    told.

load_q2:-
    see('C:/Users/Tenzou/Documents/Prolog/sm/Task7 Akinator/predicats/q2.txt'),
    get0(Sym),
    read_q2(Sym),
    seen.


question1(X1):-
    write("Question 1?"),nl,
    write("1. Yes"),nl,
    write("0. NO"),nl,
    read(X1).

question2(X2):-
    write("Question 2?"),nl,
    write("1. Yes"),nl,
    write("0. NO"),nl,
    read(X2).


run:-
    load_q1,
    load_q2,
    question1(X1),
    question2(X2),
    get0(_),
    (q1(X,X1),q2(X,X2) ->
    write(X);

    writeln("Write your answer:"),
    read_str(Answer),
    name(Name,Answer),
    asserta(q1(Name,X1)),
    asserta(q2(Name,X2)),
    save_q1,
    save_q2).























