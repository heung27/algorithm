# 1242. 소풍

### classification
* Math
* Number theory

### solution
* 동호의 위치를 상대적 위치로 기억하는게 포인트
* 한 명씩 퇴장할 때마다 N 값이 줄어들고 동호의 상대적 위치를 구함
* 동호보다 앞에 있던 사람이 제거된다면 동호의 위치는 제거된 사람의 위치 - 동호의 위치
* 동호보다 뒤에 있던 사람이 제거된다면 동호의 위치는 제거된 사람의 위치 - 동호의 위치 + N
* 반복하다 제거되는 위치가 동호의 위치라면 종료

### link
https://www.acmicpc.net/problem/1242