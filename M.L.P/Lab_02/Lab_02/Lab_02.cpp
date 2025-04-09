#include <iostream>
#include <iomanip>
#include <stdlib.h>
#include <conio.h>
#include <string>
#define N 5

float _matrix[N][N];
int i, j;

// ������� �������
float min_matrix()
{
	float min_values[N];
	for (i = 0; i < N; i++)
		min_values[i] = *std::min_element(_matrix[i], _matrix[i] + N);
	
	return *std::min_element(min_values, min_values + N);
}

// �������� �������
float max_values()
{
	float max_values[N];
	for (i = 0; i < N; i++)
		max_values[i] = *std::max_element(_matrix[i], _matrix[i] + N);

	return *std::max_element(max_values, max_values + N);
}

// �������� ���������������� ����� �������
float max_downtriangle_values()
{
	float max_value = _matrix[0][0];
	for (i = 0; i < N; i++)
	{
		for (j = 0; j < N; j++)
		{
			if (j > i)
				break;
			else
			{
				if (_matrix[i][j] > max_value)
					max_value = _matrix[i][j];
			}
		}
	}

	return max_value;
}

// �������� ����������������� ����� �������
float max_uptriangle_values()
{
	float max_value = _matrix[0][N - 1];
	for (i = 0; i < N; i++)
	{
		for (j = 0; j < N; j++)
		{
			if (j <= i)
				continue;
			else
			{
				if (_matrix[i][j] > max_value)
					max_value = _matrix[i][j];
			}
		}
	}

	return max_value;
}

// ������� ���������������� ����� �������
float min_downtriangle_values()
{
	float min_value = _matrix[0][0];
	for (i = 0; i < N; i++)
	{
		for (j = 0; j < N; j++)
		{
			if (j > i)
				break;
			else
			{
				if (_matrix[i][j] < min_value)
					min_value = _matrix[i][j];
			}
		}
	}

	return min_value;
}

// ������� ����������������� ����� �������
float min_uptriangle_values()
{
	float min_value = _matrix[0][N - 1];
	for (i = 0; i < N; i++)
	{
		for (j = 0; j < N; j++)
		{
			if (j <= i)
				continue;
			else
			{
				if (_matrix[i][j] < min_value)
					min_value = _matrix[i][j];
			}
		}
	}

	return min_value;
}

// �������� ������� ��������� �������
float max_maindiag_values()
{
	float main_diagonal_values[N];
	for (i = 0; i < N; i++)
	{
		for (j = 0; j < N; j++)
		{
			if (j == i)
				main_diagonal_values[i] = _matrix[i][j];
			else
				continue;
		}
	}

	return *std::max_element(main_diagonal_values, main_diagonal_values + N);
}

// ������� ������� ��������� �������
float min_maindiag_values()
{
	float main_diagonal_values[N];
	for (i = 0; i < N; i++)
	{
		for (j = 0; j < N; j++)
		{
			if (j == i)
				main_diagonal_values[i] = _matrix[i][j];
			else
				continue;
		}
	}

	return *std::min_element(main_diagonal_values, main_diagonal_values + N);
}

// �������� �������������� ��������� �������
float max_secdiag_values()
{
	float sec_diagonal_values[N];
	for (i = 0; i < N; i++)
	{
		for (j = 0; j < N; j++)
		{
			if (j == N - 1 - i)
				sec_diagonal_values[i] = _matrix[i][j];
			else
				continue;
		}
	}

	return *std::max_element(sec_diagonal_values, sec_diagonal_values + N);
}

// ������� �������������� ��������� �������
float min_secdiag_values()
{
	float sec_diagonal_values[N];
	for (i = 0; i < N; i++)
	{
		for (j = 0; j < N; j++)
		{
			if (j == N - 1 - i)
				sec_diagonal_values[i] = _matrix[i][j];
			else
				continue;
		}
	}

	return *std::min_element(sec_diagonal_values, sec_diagonal_values + N);
}

// ������������������� ��������� ��������� �������
float midle_arithmetic_value()
{
	float sum = 0.0;
	int matrix_size = N * N;

	for (i = 0; i < N; i++)
	{
		for (j = 0; j < N; j++)
			sum += _matrix[i][j];
	}

	return sum / matrix_size;
}

// ������������������� ��������� ��������� ���������������� ����� �������
float midle_arithmetic_value_downtriangle()
{
	float sum = 0.0;
	int nums = 0;
	for (i = 0; i < N; i++)
	{
		for (j = 0; j < N; j++)
		{
			if (j > i)
				break;
			else
			{
				nums++;
				sum += _matrix[i][j];
			}
		}
	}

	return sum / nums;
}

// ������������������� ��������� ��������� ����������������� ����� �������
float midle_arithmetic_value_uptriangle()
{
	float sum = 0.0;
	int nums = 0;
	for (i = 0; i < N; i++)
	{
		for (j = 0; j < N; j++)
		{
			if (j <= i)
				continue;
			else
			{
				nums++;
				sum += _matrix[i][j];
			}
		}
	}

	return sum / nums;
}

// ����� ����� �������
void rows_sum()
{
	std::printf("����� ����� �������: ");
	for (i = 0; i < N; i++)
	{
		float sum = 0.0;
		for (j = 0; j < N; j++)
			sum += _matrix[i][j];
		if (i < N - 1)
			std::printf("%.1f, ", sum);
		else
			std::printf("%.1f", sum);
	}
	std::printf("\n");
}

// ����� �������� �������
void columns_sum()
{
	std::printf("����� �������� �������: ");
	for (i = 0; i < N; i++)
	{
		float sum = 0.0;
		for (j = 0; j < N; j++)
			sum += _matrix[j][i];
		if (i < N - 1)
			std::printf("%.1f, ", sum);
		else
			std::printf("%.1f", sum);
	}
	std::printf("\n");
}

// ����������� �������� ����� �������
void min_values_rows()
{
	std::printf("����������� �������� ����� �������: ");
	for (i = 0; i < N; i++)
	{
		if (i < N - 1)
			std::printf("%.1f, ", *std::min_element(_matrix[i], _matrix[i] + N));
		else
			std::printf("%.1f", *std::min_element(_matrix[i], _matrix[i] + N));
	}
	std::printf("\n");
}

// ����������� �������� �������� �������
void min_values_columns()
{
	std::printf("����������� �������� �������� �������: ");
	float values[N];
	for (i = 0; i < N; i++)
	{
		for (j = 0; j < N; j++)
			values[j] = _matrix[j][i];

		if (i < N - 1)
			std::printf("%.1f, ", *std::min_element(values, values + N));
		else
			std::printf("%.1f", *std::min_element(values, values + N));
	}
	std::printf("\n");
}

// ������������ �������� ����� �������
void max_values_rows()
{
	std::printf("������������ �������� ����� �������: ");
	for (i = 0; i < N; i++)
	{
		if (i < N - 1)
			std::printf("%.1f, ", *std::max_element(_matrix[i], _matrix[i] + N));
		else
			std::printf("%.1f", *std::max_element(_matrix[i], _matrix[i] + N));
	}
	std::printf("\n");
}

// ����������� �������� �������� �������
void max_values_columns()
{
	std::printf("����������� �������� �������� �������: ");
	float values[N];
	for (i = 0; i < N; i++)
	{
		for (j = 0; j < N; j++)
			values[j] = _matrix[j][i];

		if (i < N - 1)
			std::printf("%.1f, ", *std::max_element(values, values + N));
		else
			std::printf("%.1f", *std::max_element(values, values + N));
	}
	std::printf("\n");
}

// �������������������� �������� ����� �������
void midle_arithmetic_value_rows()
{
	std::printf("�������������������� �������� ����� �������: ");
	float res = 0.0;
	for (i = 0; i < N; i++)
	{
		res = 0.0;
		for (j = 0; j < N; j++)
			res += _matrix[i][j];

		if (i < N - 1)
			std::printf("%.1f, ", res / N);
		else
			std::printf("%.1f", res / N);
	}
	std::printf("\n");
}

// �������������������� �������� �������� �������
void midle_arithmetic_value_columns()
{
	std::printf("�������������������� �������� �������� �������: ");
	float res = 0.0;
	for (i = 0; i < N; i++)
	{
		res = 0.0;
		for (j = 0; j < N; j++)
			res += _matrix[j][i];

		if (i < N - 1)
			std::printf("%.1f, ", res / N);
		else
			std::printf("%.1f", res / N);
	}
	std::printf("\n");
}

// ����� ����� � ����������������� ������ �������
void sum_down_and_uptriangle()
{
	float upper_sums = 0.0;
	float lower_sums = 0.0;
	for (i = 0; i < N; i++)
	{
		for (j = 0; j < N; j++)
		{
			if (j > i)
				upper_sums += _matrix[i][j];
			else
				lower_sums += _matrix[i][j];
		}
	}
	std::printf("����� ���������������� ����� �������: %.1f\n", lower_sums);
	std::printf("����� ����������������� ����� �������: %.1f\n", upper_sums);
}

// �������, �������� ������� �� �������� � ���������������������
void bliz_midle_arithmetic()
{
	float mean = midle_arithmetic_value();
	float minDiff = max_value();
	float currentDiff = 0.0;
	float result = 0.0;
	for (i = 0; i < N; i++)
	{
		for (j = 0; j < N; j++)
		{
			currentDiff = std::abs(_matrix[i][j] - mean);
			if (minDiff > currentDiff)
			{
				minDiff = currentDiff;
				result = _matrix[i][j];
			}
		}
	}

	std::printf("�������, �������� ������� �� �������� � ���������������������:" %.1f\n", result);
}

// ������� ������
void main()
{
	for (i = 0; i < N; i++)
		for (j = 0; j < N; j++) _matrix[i][j] = rand() / 10.;
	for (i = 0; i < N; i++)
	{
		for (j = 0; j < N; j++)
			std::cout << std::setw(8) << std::setprecision(5) << _matrix[i][j];
		std::cout << std::endl;
	}

	std::cout << "������� �������: " << min_matrix() << std::endl;
	std::cout << "�������� �������: " << max_values() << std::endl;
	std::cout << "�������� ���������������� �������: " << max_downtriangle_values() << std::endl;
	std::cout << "�������� ����������������� �������: " << max_uptriangle_values() << std::endl;
	std::cout << "������� ���������������� �������: " << min_downtriangle_values() << std::endl;
	std::cout << "������� ����������������� �������: " << min_uptriangle_values() << std::endl;
	std::cout << "�������� ������� ��������� �������: " << max_maindiag_values() << std::endl;
	std::cout << "������� ������� ��������� �������: " << min_maindiag_values() << std::endl;
	std::cout << "�������� �������� ��������� �������: " << max_secdiag_values() << std::endl;
	std::cout << "������� �������� ��������� �������: " << min_secdiag_values() << std::endl;

	std::cout << "�������������������� �������� �������: " << bliz_midle_arithmetic() << std::endl;
	std::cout << "������������������� �������� ��������� ���������������� ����� �������: " << midle_arithmetic_value_downtriangle() << std::endl;
	std::cout << "������������������� �������� ��������� ����������������� ����� �������: " << midle_arithmetic_value_uptriangle() << std::endl;

	rows_sum();
	columns_sum();
	min_values_rows();
	min_values_columns();
	max_values_rows();
	max_values_columns();
	midle_arithmetic_value();
	midle_arithmetic_value_rows();
	midle_arithmetic_value_columns();
	sum_down_and_uptriangle();
	bliz_midle_arithmetic();
}