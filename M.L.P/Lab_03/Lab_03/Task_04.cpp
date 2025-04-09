#include <iostream>
#include "Sort.h"

void Task_04()
{
	int mas[] = { 2, 4, 3, 1, 8, 7, 9, 0, 10, 2};
    int size = sizeof(mas) / sizeof(mas[0]);

    std::cout << "Оригинальный список:\n";
    for (int i = 0; i < size; ++i)
        std::cout << mas[i] << " ";
    std::cout << std::endl;

    Sort::QuickSort(mas, 0, 4);

    std::cout << "Результат сортировки:\n";
    for (int i = 0; i < size; ++i)
        std::cout << mas[i] << " ";
    std::cout << std::endl;
}