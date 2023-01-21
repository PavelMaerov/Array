import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        //Объявите три массива:
        //Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        int [] intArray = new int []{1,2,3};
        System.out.println(intArray.toString() + " Содержимое:" + Arrays.toString(intArray));
        //Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986.
        //Массив сразу заполните значениями.
        float[] floatArray = {1.57f, 7.654f, 9.986f};
        System.out.println(floatArray + " Содержимое:" + Arrays.toString(floatArray));  //.toString() - implicit
        //Произвольный массив. Тип и количество данных определите сами.
        //Самостоятельно выберите способ создания массива: с помощью ключевого слова
        //или сразу заполненный элементами.
        //Пробую создать массив из целочисленных массивов
        int [][] intArrayArray = new int [3][4];  //интересно, что первый индекс объявляет размерность внешнего, а второй - внутреннего массива.
        System.out.println(intArrayArray + " Содержимое внешнего:" + Arrays.toString(intArrayArray) + " Содержимое внутреннего:" + Arrays.toString(intArrayArray[2]));
        int [][] intArrayArray2 = {intArray,intArray,intArray};  //заполненный элементами
        System.out.println(intArrayArray2 + " Содержимое внешнего:" + Arrays.toString(intArrayArray2) + " Содержимое внутреннего:" + Arrays.toString(intArrayArray2[2]));
        System.out.println();

        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        //В конце строки запятую ставить не надо.
        System.out.println("Задача 2");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i != intArray.length-1) {System.out.print(", ");}
        }
        System.out.println();
        for (int i = 0; i < floatArray.length; i++) {
            System.out.print(floatArray[i]);
            if (i != floatArray.length-1) {System.out.print(", ");}
        }
        System.out.println();
        for (int i = 0; i < intArrayArray.length; i++) {
            System.out.print(intArrayArray[i]);
            if (i != intArrayArray.length-1) {System.out.print(", ");}
        }
        System.out.println();
        System.out.println();

        //Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        //В конце строки запятую ставить не надо.
        System.out.println("Задача 3");
        for (int i = intArray.length-1; i >= 0 ; i--) {
            System.out.print(intArray[i]);
            if (i != 0) {System.out.print(", ");}
        }
        System.out.println();
        for (int i = intArray.length-1; i >= 0 ; i--) {
            System.out.print(floatArray[i]);
            if (i != 0) {System.out.print(", ");}
        }
        System.out.println();
        for (int i = intArray.length-1; i >= 0 ; i--) {
            System.out.print(intArrayArray[i]);
            if (i != 0) {System.out.print(", ");}
        }
        System.out.println();
        System.out.println();

        //Пройдитесь по первому целочисленному массиву
        //и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        System.out.println("Задача 4");
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {intArray[i]++;}
        }
        System.out.println(Arrays.toString(intArray));
    }
}