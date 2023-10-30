# 🚀 기능 목록


### 1. 입력 받기
- [ ] `GameManager`가 게임에 필요한 정보를 입력 받는다. - GameManager#askInput()
- [x] 경주할 자동차 이름 입력받기 : "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"
  - [x] 입력받은 문자열을 쉼표 기준으로 구분하여 자동차 목록으로 반환한다. - Cars#constructor()
- [ ] 시도할 횟수 입력받기 : "시도할 회수는 몇회인가요?"
  - [ ] 자동차 이름은 쉼표 기준으로 구분하여 5자 이하 - Car#throwIfInvalidNameLength()

### 2. 게임 진행 : 전진하기
- [ ] `GameManager`가 입력 받은 횟수 동안 n대 자동차 전진 or 멈춤 - Car#drive()
- [x] 0~9 사이에서 무작위 값을 구한다. - NumberGenerator#createRandomNumber()
  - Random 값 추출은 `camp.nextstep.edu.missionutils.Random`s의 `pickNumberInRange()` 활용
- [ ] 전진 조건 : 무작위 값이 4 이상일 경우 - Car#isGoingForward()
- [ ] 실행결과(출력) : 전진하는 자동차 이름을 같이 출력 - Car#printCarState()

### 3. 우승자 구하기
- [ ] `Referee`는 게임 완료 후 우승자를 알려준다. - Referee#determineWinners()
  - [ ] 출력 : "최종 우승자 : " - Referee#announceWinners()
  - 우승자는 한 명 이상일 수 있다.
  - 우승자가 여러 명일 경우 쉼표로 구분