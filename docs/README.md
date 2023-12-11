# 🚀 기능 명세서

- [x] 경주할 자동차 이름 입력
  - [x] "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)" 출력 - InputView#inputCars
  - [x] 자동차 이름이 5자를 초과할 경우 - GameManager#validate
  - [x] 중복되는 자동차 이름이 존재하는 경우 - Cars#validate
- [x] 몇 번 이동할 것인지 횟수 입력
    - [x] "시도할 횟수는 몇회인가요?" 출력 - InputView#inputTryNumber
    - [x] 숫자가 아닌 경우 - GameManager#validate
- [x] 자동차 전진 - Car#move
  - [x] "실행 결과" 출력 - OutputView#printResult
  - [x] "자동차명 : --" 형식으로 자동차 전진 정보 출력 - OutputView#printCarMovement
  - [x] 시도 횟수마다 줄바꿈 출력 - OutputView#printLineBreak
  - [x] 0에서 9 사이 무작위 값으로 설정 - RandomNumberGenerator#createRandomNumber
    - [x] Randoms.pickNumberInRange(int a, int b) 라이브러리 활용
  - [x] 전진 Car#move
    - [x] 무작위 값이 4 이상인지 확인한다. - Cars#isMovingForward
- [x] 우승자 판별 - Referee#determineWinners
  - [x] 최종 우승자 저장 - Winners
  - [x] "최종 우승자 : 자동차명, 자동차명" 형식으로 우승자 출력 - OutputView#printWinner
  - [x] 전진 횟수가 가장 많은 자동차 판별 - Cars#findCarNamesWithMaxForwardCount()

- random number generator singleton