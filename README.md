# ImageButton and 9-patch

### 1. 9-patch란

- 다양한 디바이스 환경에 맞춰 ImageButton을 깨지지 않게 처리한다.
- `@drawable/xxxxx.9.png` 파일이 9-patch 이미지 파일을 의미하며 변환 전 파일은 삭제해야한다. 

> 아래와 같이 검은 선으로 되어 있는 영역 내의 비트맵이 컨텐츠 길이에 따라 유동적으로 변화한다.  

![](http://radleymarx.com/blog/wp-content/uploads/2011/05/fill-area.png)

> 안드로이드 스튜디오 내의 9-patch 설정화면은 다음과 같다. 검은 선을 조절해주면 된다. 

![](https://ws4.sinaimg.cn/large/006tNc79gy1fj9zf3mrrvj31kw0zk15t.jpg)