#include <iostream>
#include "Sort.h"

void Task_05()
{
    int mas[] = { 1, 10, 3, 8, 5, 6, 7, 4, 9, 2 };
    int size = sizeof(mas) / sizeof(mas[0]);

    std::cout << "Оригинальный список:\n";
    for (int i = 0; i < size; ++i)
        std::cout << mas[i] << " ";
    std::cout << std::endl;

    Sort::QuickSortReverse(mas, 0, 4);

    std::cout << "Результат сортировки:\n";
    for (int i = 0; i < size; ++i)
        std::cout << mas[i] << " ";
    std::cout << std::endl;
}