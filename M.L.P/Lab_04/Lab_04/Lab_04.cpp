#include <iostream>
#include <string.h>

int main()
{
    char str1[] = "myname", str2[] = "19575";
    int strlen1(char*);
    int strlen2(char*);
    int strlen3(char*);
    void strcpy(char*, char*);
    void strcmp(char*, char*);
    void strcat(char*, char*);
    
    std::cout << "Lenght_1: str1 = " << strlen1(str1) << ", str2 = " << strlen1(str2) << std::endl;
    std::cout << "Lenght_2: str1 = " << strlen2(str1) << ", str2 = " << strlen2(str2) << std::endl;
    std::cout << "Lenght_3: str1 = " << strlen3(str1) << ", str2 = " << strlen3(str2) << std::endl;

    std::cout << "Before copy: str1 = " << str1 << ", str2 = " << str2 << std::endl;
    strcpy(str1, str2);
    std::cout << "After copy: str1 = " << str1 << ", str2 = " << str2 << std::endl;

    std::cout << "Before compare: str1 = " << str1 << ", str2 = " << str2 << std::endl;
    strcmp(str1, str2);    

    std::cout << "Before concatenation: str1 = " << str1 << ", str2 = " << str2 << std::endl;
    strcat(str1, str2);

    // with malloc()
    char* string1 = (char*)std::malloc(100);
    char* string2 = (char*)std::malloc(100);

    strcpy_s(string1, 100, "MYNAME");
    strcpy_s(string2, 100, "26843");



    std::cout << "Lenght_1: string1 = " << strlen1(string1) << ", string2 = " << strlen1(string2) << std::endl;
    std::cout << "Lenght_2: string1 = " << strlen2(string1) << ", string2 = " << strlen2(string2) << std::endl;
    std::cout << "Lenght_3: string1 = " << strlen3(string1) << ", string2 = " << strlen3(string2) << std::endl;

    std::cout << "Before copy: string1 = " << string1 << ", string2 = " << string2 << std::endl;
    strcpy(string1, string2);
    std::cout << "After copy: string1 = " << string1 << ", string2 = " << string2 << std::endl;

    std::cout << "Before compare: string1 = " << string1 << ", string2 = " << string2 << std::endl;
    strcmp(string1, string2);

    std::cout << "Before concatenation: string1 = " << string1 << ", string2 = " << string2 << std::endl;
    strcat(string1, string2);

    std::free(string1);
    std::free(string2);

    // with calloc()
    string1 = (char*)std::calloc(7, sizeof(char*));
    string2 = (char*)std::calloc(11, sizeof(char*));

    strcpy_s(string1, 7, "MYNAME");
    strcpy_s(string2, 11, "26843");

    std::cout << "Lenght_1: string1 = " << strlen1(string1) << ", string2 = " << strlen1(string2) << std::endl;
    std::cout << "Lenght_2: string1 = " << strlen2(string1) << ", string2 = " << strlen2(string2) << std::endl;
    std::cout << "Lenght_3: string1 = " << strlen3(string1) << ", string2 = " << strlen3(string2) << std::endl;

    std::cout << "Before copy: string1 = " << string1 << ", string2 = " << string2 << std::endl;
    strcpy(string1, string2);
    std::cout << "After copy: string1 = " << string1 << ", string2 = " << string2 << std::endl;

    std::cout << "Before compare: string1 = " << string1 << ", string2 = " << string2 << std::endl;
    strcmp(string1, string2);

    std::cout << "Before concatenation: string1 = " << string1 << ", string2 = " << string2 << std::endl;
    strcat(string1, string2);

    std::free(string1);
    std::free(string2);


}

// Измерение длины строки, проходит по строке, пока не найдет \0
int strlen1(char* str)
{
    return (*str) ? strlen1(++str) + 1 : 0;
}

// Подсчет символов через цикл While
int strlen2(char* str)
{
    int result = 0;
    while (*str)
    {
        str++;
        result++;
    }
    return result;
}

// Вычисляет длину слова через разницу в символах между указателем на первый и последнйи символы
int strlen3(char* str)
{
    char* start = str;
    while (*str)
        str++;
    return str - start;
}

// Копирует содержимое одной строки в другую
void strcpy(char* strDestination, char* strSource)
{
    while (*strDestination)
    {
        if (*strSource)
        {
            *strDestination = *strSource;
            strDestination++;
            strSource++;
        }
        else
        {
            *strDestination = '\0';
            strDestination++;
        }
    }
}

// Сравнение строк
void strcmp(char* str1, char* str2)
{
    if (!*str1 && !*str2)
    {
        std::cout << "Compare result: TRUE" << std::endl;
        return;
    }

    if (*str1 == *str2)
    {
        strcmp(++str1, ++str2);
    }
    else
    {
        std::cout << "Compare result: FALSE" << std::endl;
        return;
    }
}

// Сложение строк
void strcat(char* str1, char* str2)
{
    char newstr[80];
    int i = 0;
    while (*str1)
    {
        newstr[i] = *str1;
        str1++;
        i++;
    }
    while (*str2)
    {
        newstr[i] = *str2;
        str2++;
        i++;
    }

    newstr[i] = '\0';
    std::cout << "Concatenation result: " << newstr << std::endl;
}
