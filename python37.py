import numpy as np

matrix = np.arange(1, 13, 1).reshape(3, 4)
print(matrix)
# matrix는 아래와 같습니다.
# [[ 1  2  3  4]
#  [ 5  6  7  8]
#  [ 9 10 11 12]]

# 1. Indexing을 통해 값 2를 출력해보세요.
answer1 = matrix[0, 1] # 2는 0행 1열에 있습니다.

# 2. Slicing을 통해 매트릭스 일부인 9, 10을 가져와 출력해보세요.
answer2 = matrix[2:, :2] # 2행 첫 두 개 열에 9, 10 이 있습니다. (2:, :2)

# 3. Boolean indexing을 통해 5보다 작은 수를 찾아 출력해보세요.
answer3 = matrix[matrix < 5]

# 4. Fancy indexing을 통해 두 번째 행만 추출하여 출력해보세요.
answer4 = matrix[ [ 1 ] ] # 두번째 행의 인덱스는 1입니다.

# 위에서 구한 정답을 출력해봅시다.
print(answer1)
print(answer2)
print(answer3)
print(answer4) 
