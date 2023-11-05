""" cSpell:disable """

import pytest
from mutant_detector import MutantDetector


@pytest.mark.parametrize(
    "dna, expected",
    [
        (["ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"], True),
        (
            [
                "ATGCGA",
                "CAGTGC",
            ],
            False,
        ),
        (["ATGCGA", "CAGTGC", "TTATGT", "AGAXGG", "CCCCTA", "TCACTG"], False),
    ],
)
def test_is_valid_dna_matrix(dna, expected):
    detector = MutantDetector()
    assert detector._is_valid_dna_matrix(dna) == expected


@pytest.mark.parametrize(
    "dna, expected",
    [
        (["ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"], True),
        (["ATGCGA", "CAGTGC", "TTATTT", "AGACGG", "GCGTCA", "TCACTG"], False),
    ],
)
def test_is_mutant(dna, expected):
    detector = MutantDetector()
    assert detector.is_mutant(dna) == expected
