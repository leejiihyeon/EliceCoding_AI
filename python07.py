# 괄호 안에 적절한 명제를 채워 stat1이 True가 되게 해봅시다.
stat1 = 3==3 and 2<4 and (3!=4) # () 안에 True 인 명제를 채워야 합니다.

# 괄호 안에 적절한 명제를 채워 stat2이 False가 되게 해봅시다.
stat2 = 4>=6 or "apple"=="Apple" or ("TBZ"=="SVT") # () 안에 False 인 명제를 채워야 합니다.

# 괄호 안에 적절한 명제를 채워 stat3이 True가 되게 해봅시다.
stat3 = not (3==5) # () 안에 False 인 명제를 채워야 합니다.

# 위의 세 변수를 한 문장으로 출력해서 True, False 여부를 확인해봅시다.

print(stat1, stat2, stat3)