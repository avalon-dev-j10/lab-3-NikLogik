package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];
        
        System.out.println("Инициализация массива числовым рядом Фибоначи---->");
        
        FibonacciInitializer fibonacciInit = new FibonacciInitializer();
        fibonacciInit.initialize(array);
        
        int sumArray = 0;       //суммирование всех значений массива
        for(int i : array){
            sumArray +=i;
        }
        
        System.out.println("Содержание массива после инициализации рядом Фибоначи: " + Arrays.toString(array));
        System.out.println("Сумма массива: " + sumArray);
        System.out.println("");
        
        
        System.out.println("Инициализация массива случайными числами---->");
        
        RandomInitializer randomInit = new RandomInitializer();
        randomInit.initialize(array);
        
        System.out.println("Содержание массива до сортировки пузырьком: " + Arrays.toString(array));
        
        BubbleSort bubble = new BubbleSort();
        bubble.sort(array);
        
        System.out.println("Содержание массива после сортировки пузырьком: " + Arrays.toString(array));
        System.out.println("");
        
        System.out.println("Инициализация массива случайными числами---->");
        
        randomInit.initialize(array);
        
        System.out.println("Содержание массива до сортировки выбором: " + Arrays.toString(array));
        
        SelectionSort select = new SelectionSort();
        select.sort(array);
        
        System.out.println("Содержание массива после сортировки выбором: " + Arrays.toString(array));
        System.out.println("");
        
        System.out.println("Инициализация массива случайными числами---->");
        randomInit.initialize(array);
        
        System.out.println("Содержание массива до сортировки Шелла: " + Arrays.toString(array));
        
        ShellSort shell = new ShellSort();
        shell.sort(array);
        
        System.out.println("Содержание массива после сортировки Шелла: " + Arrays.toString(array));
    

	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }
}
