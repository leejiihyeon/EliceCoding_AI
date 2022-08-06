# N 명의 학생의 이름과 점수를 입력받는 함수를 작성하세요.
def get_students(N):
    students = {}
    # 여기를 채우세요.
    for i in range(N):
        name = input()
        score = int(input())
        students[name] = score
    
    return students
    
# 학생의 점수를 입력받아, 성적을 반환하는 함수 get_grade 를 작성하세요.
def get_grade(score):
    if score >= 90:
        return 'A'
    elif score >= 80:
        return 'B'
    elif score >= 70:
        return 'C'
    elif score >= 60:
        return 'D'
    else:
        return 'F'

N = int(input())
students = get_students(N) # N 명의 학생에 대한 정보를 입력받습니다.
for student_name in students.keys():
    print(student_name + ": " + get_grade(students[student_name]))