package ru.geekbrains.lesson2;

public class Homework2{
    public static void main(String[] args) {
        numberOne();
        numberTwo();
        numberThree();
        numberFour();
        numberFive();
    }



// 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void numberOne() {

        System.out.println("Номер один");

        int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int g = 0; g < arr.length; g++) {
            if (arr[g] == 1) {
                arr[g] = 0;
            } else
                arr[g] = 1;
        }
        for (int g = 0; g < arr.length; g++) { // ++ - это инкремент
            System.out.print(arr[g] + " ");
        }
        System.out.print("\n");
    }

// 2. Задать пустой целочисленный массив размером 8.
// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;


    public static void numberTwo() {
        System.out.println("Номер два");
        int arr[] = new int[8];
        for(int a = 0, b = 0; a < arr.length; a++, b +=3) { // a - это номер коробочки, b - это значение внутри коробочки
            arr[a] = b;
            System.out.print(arr[a] + " ");
        }
        System.out.println();
    }


// 3. Задать массив { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 } пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void numberThree() {
        System.out.println("Номер три");
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int h = 0; h < arr.length; h++) {
            if (arr[h] < 6) {
                arr[h] = arr[h] * 2;
            }
            System.out.print(arr[h] + " ");
        }
        System.out.println();
    }


//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void numberFour() {
        System.out.println("Номер четыре");
        int size = 4;
        int arr[][] = new int[size][size];
        for(int y = 0; y < size; y++) {
            for(int x = 0; x < size; x++){
                if(x == y || x + y == size -1 ){
                    arr[y][x] = 1;
                }
                System.out.print(arr[y][x] + " ");
            }
            System.out.println();
        }


    }
//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

    public static void numberFive() {
        System.out.println("Номер пять");
        int max = Integer.MIN_VALUE; // минимальное возможное интенджера
        int min = Integer.MAX_VALUE; // максимальное значение интенджера
        int arr[] = {1, -105, 5, 3, 99, 11, 4, 55, 2, 44, 8, 9, 65};
        for(int x = 0; x < arr.length; x++){
            if(arr[x] > max){
                max = arr[x];
            }
            if(arr[x] < min){
                min =arr[x];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }

// 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место,
// в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
// граница показана символами ||, эти символы в массив не входят.

//7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
// при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.
// Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
// [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.

    }




