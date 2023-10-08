import pytest
from main import *


# Test Ejercicio 1
@pytest.mark.parametrize(
    "dni_number, result",
    [
        ("1234567", True),
        ("12345678", True),
        ("123456789", False),
    ],
)
def test_validate_dni(dni_number, result):
    assert validate_dni(dni_number) == result


# Test Ejercicio 2
@pytest.mark.parametrize(
    "input_string, result",
    [
        ("Hello World", 5),
        (" Hello ", 5),
        ("", 0),
    ],
)
def test_last_word_length(input_string, result):
    assert last_word_length(input_string) == result


# Test Ejercicio 3
@pytest.mark.parametrize(
    "full_name, dni_number,result",
    [
        ("María Ines Rosales", "25469648", "María7254"),
        ("Víctor Hugo Gomenza", "31527738", "Víctor7315"),
        ("Juan Carlos Perez", "32748635", "Juan5327"),
    ],
)
def test_generate_member_id(full_name, dni_number, result):
    assert generate_member_id(full_name, dni_number) == result


# Test Ejercicio 4
@pytest.mark.parametrize(
    "num1, num2, result",
    [
        (10, 2, True),
        (7, 3, False),
        (0, 5, True),
    ],
)
def test_is_multiple(num1, num2, result):
    assert is_multiple(num1, num2) == result


# Test Ejercicio 5
@pytest.mark.parametrize(
    "max_temperature, min_temperature, result",
    [
        (30, 10, 20.0),
        (25, 15, 20.0),
        (0, 0, 0.0),
    ],
)
def test_average_temperature(max_temperature, min_temperature, result):
    assert average_temperature(max_temperature, min_temperature) == result


# Test Ejercicio 6
@pytest.mark.parametrize(
    "text, result",
    [
        ("hello", "h e l l o"),
        ("test", "t e s t"),
        ("123", "1 2 3"),
    ],
)
def test_add_space_after_letter(text, result):
    assert add_space_after_letter(text) == result


# Test Ejercicio 7
@pytest.mark.parametrize(
    "numbers, result",
    [
        ([5, 2, 8, 1], (8, 1)),
        ([10, 10, 10], (10, 10)),
        ([1, 2, 3, 4, 5], (5, 1)),
    ],
)
def test_find_max_min(numbers, result):
    assert find_max_min(numbers) == result


# Test Ejercicio 8
@pytest.mark.parametrize(
    "radius, expected_area, expected_perimeter",
    [
        (5, 78.53981633974483, 31.41592653589793),
        (0, 0.0, 0.0),
        (10, 314.1592653589793, 62.83185307179586),
    ],
)
def test_calculate_area_perimeter(radius, expected_area, expected_perimeter):
    assert calculate_area_perimeter(radius) == expected_area, expected_perimeter


# Test Ejercicio 9
@pytest.mark.parametrize(
    "username, password, attempts, result",
    [
        ("usuario1", "asdasd", 0, (True, 0)),
        ("usuario2", "contraseña", 1, (False, 2)),
        ("usuario1", "incorrecto", 3, (False, 4)),
    ],
)
def test_login(username, password, attempts, result):
    assert login(username, password, attempts) == result


# Test Ejercicio 10
@pytest.mark.parametrize(
    "cart, discounts, expected_final_price",
    [
        (
            {"product1": 20.0, "product2": 30.0, "product3": 25.0},
            {"product1": 10, "product3": 5},
            71.5,
        ),
        ({"item1": 10.0, "item2": 15.0}, {"item3": 20}, 25.0),
        ({}, {}, 0.0),
    ],
)
def test_apply_discount(cart, expected_final_price):
    assert apply_discount(cart) == expected_final_price


# Test Ejercicio 11
@pytest.mark.parametrize(
    "func, input_list, result",
    [
        (double_number, [1, 2, 3], [2, 4, 6]),
        (double_number, [0, -1, 5], [0, -2, 10]),
        (lambda x: x * 3, [2, 4, 6], [6, 12, 18]),
    ],
)
def test_apply_function_to_list(func, input_list, result):
    assert apply_function_to_list(func, input_list) == result


# Test Ejercicio 12
@pytest.mark.parametrize(
    "phrase, result",
    [
        (
            "Hola, esta es una frase de ejemplo.",
            {
                "Hola,": 5,
                "esta": 4,
                "es": 2,
                "una": 3,
                "frase": 5,
                "de": 2,
                "ejemplo.": 7,
            },
        ),
        (
            "This is a test phrase.",
            {"This": 4, "is": 2, "a": 1, "test": 4, "phrase.": 7},
        ),
    ],
)
def test_count_word_lengths(phrase, result):
    assert count_word_lengths(phrase) == result


# Test Ejercicio 13
@pytest.mark.parametrize(
    "vector, result",
    [
        ([3, 4], 5.0),
        ([0, 0, 0, 0], 0.0),
        ([1, 1, 1, 1], 2.0),
    ],
)
def test_calculate_magnitude(vector, result):
    assert calculate_magnitude(vector), result


# Test Ejercicio 14
@pytest.mark.parametrize(
    "number, result",
    [
        (2, True),
        (7, True),
        (1, False),
    ],
)
def test_is_prime(number, result):
    assert is_prime(number) == result


# Test Ejercicio 15
@pytest.mark.parametrize(
    "number, result",
    [
        (0, 1),
        (5, 120),
        (10, 3628800),
    ],
)
def test_calculate_factorial(number, result):
    assert calculate_factorial(number) == result


# Test Ejercicio 16
@pytest.mark.parametrize(
    "number, digit, result",
    [
        (1122334455, 2, 2),
        (9876543210, 0, 1),
        (123456789, 5, 1),
    ],
)
def test_calculate_frequency(number, digit, result):
    assert calculate_frequency(number, digit) == result


# Test Ejercicio 17
@pytest.mark.parametrize(
    "number, result",
    [
        (12345, 15),
        (987654321, 45),
        (0, 0),
    ],
)
def test_calculate_digit_sum(number, result):
    assert calculate_digit_sum(number) == result
