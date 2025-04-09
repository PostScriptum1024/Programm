#include <iostream>
#include "Sort.h"

bool isEven(int x) {
    return x % 2 == 0;
}

void Task_03()
{
    int mas[] = { 2, 13, 12, 6, 1, 3, 8, 4, 5, 7, 8, 1 };
    int size = sizeof(mas) / sizeof(mas[0]);

    int even[6];
    int odd[6];

    std::cout << "Оригинальный список:\n";
    for (int i = 0; i < size; ++i)
        std::cout << mas[i] << " ";
    std::cout << std::endl;


    int e = 0, o = 0;
    for (int i = 0; i < size; ++i) {
        if (isEven(mas[i]))
        {
            even[e] = mas[i];
            e++;
        }
        else
        {
            odd[o] = mas[i];
            o++;
        }
    }

    Sort::QuickSort(even, 0, 5);
    Sort::QuickSortReverse(odd, 0, 5);

    // Обьединение
    int ei = 0, oi = 0;
    for (int i = 0; i < size; ++i) {
        if (isEven(mas[i]))
            mas[i] = even[ei++];
        else
            mas[i] = odd[oi++];
    }

    std::cout << "Результат сортировки:\n";
    for (int i = 0; i < size; ++i)
        std::cout << mas[i] << " ";
    std::cout << std::endl;
}