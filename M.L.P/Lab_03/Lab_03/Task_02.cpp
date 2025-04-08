#include <iostream>
#include "Sort.h"

void Task_02()
{
    int const size = 10;
    int array1[size], array2[size];

    // заполнение массива
    std::cout << "Оригинальный массив #1:" << std::endl;
    for (int i = 0; i < size; i++)
    {
        array1[i] = rand() % (100 - 0 + 1) + 0;
        std::cout << array1[i] << std::endl;
    }
    std::cout << "Оригинальный массив #2:" << std::endl;
    for (int i = 0; i < size; i++)
    {
        array2[i] = rand() % (100 - 0 + 1) + 0;
        std::cout << array2[i] << std::endl;
    }

    Sort::BubbleSort(array1, size);
    std::cout << "Сортировка пузырьком:" << std::endl;
    for (int i = 0; i < size; i++)
        std::cout << array1[i] << std::endl;
    
    Sort::QuickSort(array2, 0, size - 1);
    std::cout << "Быстрая сортировка:" << std::endl;
    for (int i = 0; i < size; i++)
        std::cout << array2[i] << std::endl;
}