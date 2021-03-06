# 2234. 성곽

### classification
* Graph theory
* Graph search
* BFS
* BitMask

### solution
* 전체 벽의 정보를 2차원 배열에 저장
* 방 마다 벽의 정보를 나타내는 값을 이용해 BFS 진행
* 2를 나누어 나머지가 1이면 서쪽에 벽이 있는 것
* 2로 나누어진 값에 다시 2를 나누어 1이면 북쪽, 다시 2로 나누어 1이면 동쪽, 다시 2로 나누어 1이면 남쪽에 벽이 존재
* 이렇게 벽의 상하좌우 벽의 유무를 판단하여 BFS
* BFS가 종료되면 그 방의 크기를 알 수 있고 배열에 각 방의 크기를 저장해 놓음
* BFS가 실행되는 횟수가 곧 방의 개수
* 모든 BFS가 종료되면 각 방의 크기를 저장해 놓은 배열을 활용해 행우선, 열우선으로 2차원 배열을 탐색하여 두 방을 합쳤을 때의 크기를 계산

### remind
* BFS
* BitMask

### link
https://www.acmicpc.net/problem/2234