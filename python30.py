## 이렇게 해보세요!를 따라 수행해보세요.
# urlopen() : 이 함수에 url을 넣으면 해당 url에 접근한 결과를 얻을 수 있습니다.
from urllib.request import urlopen # url 패키지의 request 모듈에서 urlopen 함수를 불러오세요.

# read() : 결과를 해독하여 문자열로 반환합니다.
# decode() : 문자열을 특정 인코딩 방식으로 해독합니다. (유니코드, 아스키 코드 등)
webpage = urlopen("https://en.wikipedia.org/wiki/Lorem_ipsum").read().decode("utf-8")

print(webpage)