import numpy as np

print("1차원 array")
array = np.array(range(10))
print(array)

# 1. type()을 이용하여 array의 자료형을 출력해보세요.
print(type(array))

# 2. ndim을 이용하여 array의 차원을 출력해보세요.
print(array.ndim)

# 3. shape을 이용하여 array의 모양을 출력해보세요.
print(array.shape)

# 4. size를 이용하여 array의 크기를 출력해보세요.
print(array.size)

# 5. dtype을 이용하여 array의 dtype(data type)을 출력해보세요.
print(array.dtype)

# 6. array의 5번째 요소를 출력해보세요. (array[5])
print(array[5])

# 7. array의 3번째 요소부터 5번째 요소까지 출력해보세요. (array[3:6])
print(array[3:6])