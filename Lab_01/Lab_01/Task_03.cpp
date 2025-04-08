#include <iostream>

void Task_03()
{
	int a = 2, b = 5;
	void Exchange_1(int, int);
	void Exchange_2(int*, int*);
	void Exchange_3(int&, int&);

	std::cout << "До замены: a = " << a << ", b = " << b << std::endl;
	Exchange_01(a, b);
	std::cout << "После замены: a = " << a << ", b = " << b << std::endl;
	Exchange_02(&a, &b);
	std::cout << "После замены*: a = " << a << ", b = " << b << std::endl;
	Exchange_03(a, b);
	std::cout << "После замены**: a = " << a << ", b = " << b << std::endl;
}

void Exchange_1(int a, int b)
{
	int temp = a;
	a = b;
	b = temp;
}

void Exchange_2(int* a, int* b)
{
	int temp = *a;
	*a = *b;
	*b = temp;
}

void Exchange_3(int& a, int& b)
{
	int temp = a;
	a = b;
	b = temp;
}