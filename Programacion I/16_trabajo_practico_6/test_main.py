import pytest
from functions import *


# Test función Ejercicio 5
@pytest.mark.parametrize(
    "list, expected_result",
    [
        ([5, 16, 2, 5, 57, 5, 2], [(5, 3), (16, 1), (2, 2), (57, 1)]),
        ([1, 2, 3, 4, 5, 4, 3, 2, 1], [(1, 2), (2, 2), (3, 2), (4, 2), (5, 1)]),
    ],
)
def test_generate_count_tuples(list, expected_result):
    assert generate_count_tuples(list) == expected_result
