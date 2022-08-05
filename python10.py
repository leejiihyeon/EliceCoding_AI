# input() 을 이용해서 학생의 점수를 입력받습니다.
score = int(input())

# if-elif-else 문을 이용해서 점수가 90점 이상이면 A

if score >= 90 :
    print('A')
# 점수가 90점 미만, 80점 이상이면 B
elif 80<=score<90 :
    print('B')
# 점수가 80점 미만, 70점 이상이면 C
elif 70<=score<80 :
    print('C')
# 점수가 70점 미만, 60점 이상이면 D
elif 60<=score<70 :
    print('D')
# 그 외는 F 를 출력해봅시다.
else :
    print('F')