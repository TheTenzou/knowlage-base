package ru.thetenzou;

import org.jpl7.*;
import org.jpl7.Integer;
import org.junit.Test;


public class jplTest {

    @Test
    public void testJpl() {
        JPL.init();
        String s = "consult('E:/My_Progs/knowlage-base/Task8-Akinator-with-interface/src/main/resources/akinator.pl')";
        Query q1 = new Query(s);
        System.out.println(q1.hasSolution());
        Query q2 = new Query("load");
        System.out.println(q2.hasSolution());
        Variable X = new Variable("X");
        Query q3 = new Query("q1", new Term[] {X,new Integer(1)});
//        Map<String, Term>[] solutions = q3.allSolutions();
//        for (Map<String, Term> solution : solutions) {
//            System.out.println(solution.get("X"));
//        }
        System.out.println("no solution " + q3.hasSolution());
        System.out.println(q3.oneSolution().get("X").name());
        Query q4 = new Query("assert", new Term[] {
                new Atom("test"),
                new Integer(1),
                new Integer(1),
                new Integer(1),
                new Integer(1),
                new Integer(1),
                new Integer(1),
                new Integer(1),
                new Integer(1),
                new Integer(1),
                new Integer(1)
        });
        System.out.println(q4.hasSolution());
        Variable X1 = new Variable("X");
        Query q5 = new Query("q1", new Term[] {new Atom("test"), X1});
        System.out.println(q5.oneSolution().get("X"));
//        Query q6 = new Query("save");
//        System.out.println(q6.hasSolution());
    }
}
