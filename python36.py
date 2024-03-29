import numpy as np


print("2차원 array")
matrix = np.array(range(1,16))  #1부터 15까지 들어있는 (3,5)짜리 배열을 만듭니다.
matrix.shape = 3,5
print(matrix)


# 1. type을 이용하여 matrix의 자료형을 출력해보세요.
print(type(matrix))

# 2. ndim을 이용하여 matrix의 차원을 출력해보세요.
print(matrix.ndim)

# 3. shape을 이용하여 matrix의 모양을 출력해보세요.
print(matrix.shape)

# 4. size를 이용하여 matrix의 크기를 출력해보세요.
print(matrix.size)

# 5. dtype을 이용하여 matrix의 dtype(data type)을 출력해보세요.
print(matrix.dtype)

# 6. astype을 이용하여 matrix의 dtype을 str로 변경하여 출력해보세요.
print(matrix.astype('str'))

# 7. matrix의 (2,3) 인덱스의 요소를 출력해보세요.
print(matrix[2,3])

# 8. matrix의 행은 인덱스 0부터 인덱스 1까지 (0:2), 열은 인덱스 1부터 인덱스 3까지 (1:4) 출력해보세요.
print(matrix[0:2,1:4])