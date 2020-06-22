package com.company;


public class Main {
    int array[];

    public static void main(String[] args) {
        int TestArray[] = {5, 32, 22, 4443};
        Main Mymain = new Main( TestArray );
        System.out.println( Mymain.Size() );
    }

    public Main(int MyArray[]) {
        this.array = MyArray;
      //  System.out.println( MyArray );

        //this.Remove( 2 ); // вызов метода удаление элемента из массива (индекс)
        //this.Add(25,2); //вызов метода добавления элемента в массив (значение, индекс)
        //this.Show(this.array);  //показать массив
       this.Sort(this.array);
       this.Min();
       this.repeat( 99 );
       this.Show(this.array);  //показать массив
    }

    public void Add(int number) { //добавление элемента в конец массива
        this.Add( number, this.Size() );
    }

    public void Add(int number, int position) { //добавление элемента в массив. аргументы - значение и индекс
        int NewArray[] = new int[this.array.length + 1];
        int j = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (i == position) {
                NewArray[position] = number;
                j++;
            }
            NewArray[j] = this.array[i];
            j++;
        }
        this.array = NewArray;
    }

    public int Size() { //функция, возрощает длину массива
        return this.array.length;
    }

    public void Remove(int position) { // удаление элемент из массива
        int NewArray[] = new int[this.array.length - 1];
        int j = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (i == position) {
                i++;
            }
            NewArray[j] = this.array[i];
            j++;
        }
        this.array = NewArray;
    }

    public void Show(int MyArray[]) {  //показать массив
        for (int i = 0; i < MyArray.length; i++) {
            System.out.print(MyArray[i]+"," );
        }
    }

    public void Sort(int MyArray[]) {  //Сортировка
        for (int i = 0; i < MyArray.length; i++) {
            int min = MyArray[i];
            int min_i = i;
            for (int j = i + 1; j < MyArray.length; j++) {
                //Если находим, запоминаем его индекс
                if (MyArray[j] < min) {
                    min = MyArray[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = MyArray[i];
                MyArray[i] = MyArray[min_i];
                MyArray[min_i] = tmp;
            }
            System.out.println("По убыванию " + MyArray[i] + ",");
        }
    }
    public void Min() { //Минимальный элемент
        int min = 0;
        for (int i = 0; i < this.array.length ; i++) {
             min = this.array[i];
            for (int j = 0; j < this.array.length; j++) {
                if (this.array[j] < min) {
                    min = this.array[j];
                }
            }
        }
        System.out.println("Минимальный элемент " + min);
    }

    public void repeat(int number) { // заполнения массива одинаковыми элементами
        for (int i = 0; i <this.array.length ; i++) {
            this.array[i] = number;

        }

    }
}
 /*

Необходимо реализовать класс в конструктор которого передается целочисленный массив.
	Необходимо реализовать в данном классе следующие функции:
добавление элемента в массив (в конец и в определенную позицию)
функцию вывод количества элементов в массиве
удаление элемента массива по индексу
изменения значения по его индексу
функция вывода на экран всего массива
функцию сортировки массива (по возрастанию и убыванию без изменения исходного массива)
функцию вывода максимального/минимального элемента
функцию заполнения массива одинаковыми элементами
*/
