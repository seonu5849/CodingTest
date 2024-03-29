# 두 개 뽑아서 더하기

### [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/68644)

### 성능요약

메모리: 74.1MB, 시간: 1.90ms


### 문제설명
정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

### 제한조건
- numbers의 길이는 2 이상 100 이하입니다.
  - numbers의 모든 수는 0 이상 100 이하입니다.

### 입출력 예
|numbers|	result|
|-|-|
|[2,1,3,4,1]|	[2,3,4,5,6,7]|
|[5,0,2,7]|	[2,5,7,9,12]|

### 입출력 예 설명
입출력 예 #1

- 2 = 1 + 1 입니다. (1이 numbers에 두 개 있습니다.)
- 3 = 2 + 1 입니다.
- 4 = 1 + 3 입니다.
- 5 = 1 + 4 = 2 + 3 입니다.
- 6 = 2 + 4 입니다.
- 7 = 3 + 4 입니다.

따라서 [2,3,4,5,6,7] 을 return 해야 합니다.

입출력 예 #2

- 2 = 0 + 2 입니다.
- 5 = 5 + 0 입니다.
- 7 = 0 + 7 = 5 + 2 입니다.
- 9 = 2 + 7 입니다.
- 12 = 5 + 7 입니다.

따라서 [2,5,7,9,12] 를 return 해야 합니다.

### :star: 문제 핵심
- 경우의 수 만큼 두 수를 더한 값을 Set에 담습니다.
- Set은 TreeSet을 구현 클래스로하여 중복을 제거함과 동시에 오름차순으로 정렬해줍니다.
- setToArray() 메소드를 통해 Set은 배열로 변환하는 작업을 수행합니다.