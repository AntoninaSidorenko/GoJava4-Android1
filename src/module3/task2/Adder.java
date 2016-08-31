package module3.task2;

public class Adder extends Arithmetic {
    boolean check(Integer a, Integer b) {
        if (a >= b) return true;
        else return false;
    }
}


/*
_____________________________

        if (a >= b) {
            return true;
        }
        return false;
_____________________________

         return (a >= b)? true : false;

 Какой из этих трех вариантов будет правильней? а какой сюда вообще не подходит.
*/
