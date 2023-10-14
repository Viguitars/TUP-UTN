import pytest
from main import *


# Test Validación números enteros
@pytest.mark.parametrize(
    "input_str, expected_result",
    [
        ("abcd", False),
        ("ab.12", False),
        ("12,34", False),
        ("12.34", False),
        ("1234", True),
    ],
)
def test_is_an_integer(input_str, expected_result):
    assert is_an_integer(input_str) == expected_result


# Test Ejercicio 1
@pytest.mark.parametrize(
    "dni_number, expected_result",
    [
        ("1234567", True),
        ("12345678", True),
        ("123456789", False),
    ],
)
def test_is_a_valid_dni(dni_number, expected_result):
    assert is_a_valid_dni(dni_number) == expected_result


# Test Ejercicio 2
@pytest.mark.parametrize(
    "input_string, expected_result",
    [
        ("Hello World", 5),
        (" Hello ", 5),
        ("", 0),
    ],
)
def test_last_word_length(input_string, expected_result):
    assert last_word_length(input_string) == expected_result


# Test Ejercicio 3
@pytest.mark.parametrize(
    "full_name, dni_number,expected_result",
    [
        ("María Ines Rosales", "25469648", "María7254"),
        ("Víctor Hugo Gomenza", "31527738", "Víctor7315"),
        ("Juan Carlos Perez", "32748635", "Juan5327"),
    ],
)
def test_generate_member_id(full_name, dni_number, expected_result):
    assert generate_member_id(full_name, dni_number) == expected_result


# Test Ejercicio 4
@pytest.mark.parametrize(
    "num1, num2, expected_result",
    [
        (10, 2, True),
        (7, 3, False),
        (0, 5, True),
    ],
)
def test_is_multiple(num1, num2, expected_result):
    assert is_multiple(num1, num2) == expected_result


# Test Ejercicio 5
@pytest.mark.parametrize(
    "max_temperature, min_temperature, expected_result",
    [
        (30, 10, 20.0),
        (25, 15, 20.0),
        (0, 0, 0.0),
    ],
)
def test_average_temperature(max_temperature, min_temperature, expected_result):
    assert average_temperature(max_temperature, min_temperature) == expected_result


# Test Ejercicio 6
@pytest.mark.parametrize(
    "text, expected_result",
    [
        ("hello", "h e l l o"),
        ("test", "t e s t"),
        ("123", "1 2 3"),
    ],
)
def test_add_space_after_letter(text, expected_result):
    assert add_space_after_letter(text) == expected_result


# Test Ejercicio 7
@pytest.mark.parametrize(
    "numbers, expected_result",
    [
        ([5, 2, 8, 1], (8, 1)),
        ([10, 10, 10], (10, 10)),
        ([1, 2, 3, 4, 5], (5, 1)),
    ],
)
def test_find_max_min(numbers, expected_result):
    assert find_max_min(numbers) == expected_result


# Test Ejercicio 8
@pytest.mark.parametrize(
    "radius, expected_area",
    [
        (5, 78.54),
        (0, 0.00),
        (10, 314.16),
    ],
)
def test_calculate_area(radius, expected_area):
    assert calculate_area(radius) == expected_area


@pytest.mark.parametrize(
    "radius, expected_perimeter",
    [
        (5, 31.42),
        (0, 0.00),
        (10, 62.83),
    ],
)
def test_calculate_perimeter(radius, expected_perimeter):
    assert calculate_perimeter(radius) == expected_perimeter


# Test Ejercicio 9
@pytest.mark.parametrize(
    "username, password, attempts, expected_result",
    [
        ("usuario1", "asdasd", 0, (True, 0)),
        ("usuario2", "contraseña", 1, (False, 2)),
        ("usuario1", "incorrecto", 3, (False, 4)),
    ],
)
def test_login(username, password, attempts, expected_result):
    assert login(username, password, attempts) == expected_result


# Test Ejercicio 10
@pytest.mark.parametrize(
    "shopping_cart, discounts, expected_result",
    [
        (
            {"product1": 20.0, "product2": 30.0, "product3": 25.0},
            {"product1": 10, "product3": 5},
            71.75,
        ),
        ({"item1": 10.0, "item2": 15.0}, {"item3": 20}, 25.0),
        ({}, {}, 0.0),
    ],
)
def test_apply_discount(shopping_cart, discounts, expected_result):
    assert apply_discount(shopping_cart, discounts) == expected_result


# Test Ejercicio 11
@pytest.mark.parametrize(
    "func, input_list, expected_result",
    [
        (double_number, [1, 2, 3], [2, 4, 6]),
        (double_number, [0, -1, 5], [0, -2, 10]),
        (double_number, [2, 4, 6], [4, 8, 12]),
    ],
)
def test_apply_function_to_list(func, input_list, expected_result):
    assert apply_function_to_list(func, input_list) == expected_result


# Test Ejercicio 12
@pytest.mark.parametrize(
    "phrase, expected_result",
    [
        (
            "Hola, esta es una frase de ejemplo",
            {
                "Hola,": 5,
                "esta": 4,
                "es": 2,
                "una": 3,
                "frase": 5,
                "de": 2,
                "ejemplo": 7,
            },
        ),
        (
            "This is a test phrase",
            {"This": 4, "is": 2, "a": 1, "test": 4, "phrase": 6},
        ),
    ],
)
def test_count_word_lengths(phrase, expected_result):
    assert count_word_lengths(phrase) == expected_result


# Test Ejercicio 13
@pytest.mark.parametrize(
    "vector, expected_result",
    [
        ([3, 4], 5.0),
        ([1, 1, 1, 1], 2.0),
    ],
)
def test_calculate_magnitude(vector, expected_result):
    assert calculate_magnitude(vector), expected_result


# Test Ejercicio 14
@pytest.mark.parametrize(
    "number, expected_result",
    [
        (2, True),
        (7, True),
        (1, False),
    ],
)
def test_is_prime(number, expected_result):
    assert is_prime(number) == expected_result


# Test Ejercicio 15
@pytest.mark.parametrize(
    "number, expected_result",
    [
        (0, 1),
        (5, 120),
        (10, 3628800),
    ],
)
def test_calculate_factorial(number, expected_result):
    assert calculate_factorial(number) == expected_result


# Test Ejercicio 16
@pytest.mark.parametrize(
    "number, digit, expected_result",
    [
        (1122334455, 2, 2),
        (9876543210, 0, 1),
        (123456789, 5, 1),
    ],
)
def test_calculate_frequency(number, digit, expected_result):
    assert calculate_frequency(number, digit) == expected_result


# Test Ejercicio 17
@pytest.mark.parametrize(
    "number, expected_result",
    [
        (12345, 15),
        (987654321, 45),
        (0, 0),
    ],
)
def test_calculate_digit_sum(number, expected_result):
    assert calculate_digit_sum(number) == expected_result
