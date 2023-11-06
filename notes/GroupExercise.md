# Group Exercise - ISBN

## Background
An ISBN, International Standard Book Number, uniquely identifies books and book-like products published internationally. Its purpose is to establish and identify one title or edition of a title from one specific publisher and is unique to that edition, allowing for more efficient marketing of products by booksellers, libraries, universities, wholesalers and distributors.

There are 2 ISBN standards: `ISBN-10` and `ISBN-13`.
- `ISBN-10` examples
   - `0471958697`
   - `0 321 14653 0` 
   - `0-123-45672-X`
- `ISBN-13` examples
  - `9780470059029` 
  - `978 0 471 48648 0` 
  - `978-0596809485`

`ISBN-10` is made up of 9 digits plus a check digit (which may be `X`) and `ISBN-13` is made up of 12 digits plus a check digit. Spaces and hyphens may be included in a code, but are not significant. This means that `9780471486480` is equivalent to `978-0-471-48648-0` and `978 0 471 48648 0`.

The check digit for `ISBN-10` is calculated by multiplying each digit by its position (i.e., 1 x 1st digit, 2 x 2nd digit, etc.), summing these products together and taking `modulo 11` of the result (with `X` being used if the result is `10`).

The check digit for `ISBN-13` is calculated by multiplying each digit alternately by 1 or 3 (i.e., 1 x 1st digit, 3 x 2nd digit, 1 x 3rd digit, 3 x 4th digit, etc.), summing these products together, taking `modulo 10` of the result and subtracting this value from `10`. If this calculation results in an apparent check digit of `10`, the check digit is `0`.

## Task
Build a simple program that instantiate `Isbn` object from a given ISBN string. When ISBN is invalid, throw `InvalidIsbnException`.

For example, `Isbn.of("047-1958-697")` should create an instance of `Isbn` and print the `0471958697` when `toString()` is called.

On the other hand, `Isbn.of("0471958698")` should throw `InvalidIsbnException`.

Do not create a main method, demonstrate different scenarios using tests.

Feel free to incorporate everything you learned.

## Rules
The commits must follow the `Red, Green and Refactor` or the `3 Rules of TDD`.

To be more specific… The first commit must only be for 1 failing test. Then the next commit must be to make the test pass.

Then repeat and do the same for the rest of the expected behaviors.

## Criteria
1. Adherence to TDD - `40%`
2. Completeness - `20%`
3. Test Coverage
   - 80% coverage - `15%`
   - 85% coverage - `20%`
   - 90% (and above) coverage - `25%`
4. Timely Submission - `15%`

## Deadline
November, 7, 2023 00:00:00AM

## Repository
As a group, decide and create a GitHub repository. Use this [project template](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.0.12&packaging=jar&jvmVersion=17&groupId=com.cognizant.masterclass&artifactId=libraryapi&name=Library%20API&description=Group%20Exercise%20for%20TDD%20and%20Spring%20Boot%20Master%20class&packageName=com.cognizant.masterclass.libraryapi).

List member names in the `README.md` file.



