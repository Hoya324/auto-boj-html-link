> 나는 노션에서 정리해둔 문제를 모두 velog로 옮기던 중에 너무나 많은 양의 문제들을 보며 '아.. 이런 반복되는 작업을 쉽게 하기 위해 코딩을 짜야겠다.' 라는 생각이 들어 아래의 코드를 작성했다.

# 코드 설명

### 이 코드는 간단하다. 
1. 형식에 맞게 제목을 입력한다.
 2. 그럼 정해둔 경로로 이런식의 코드가 작성된다.
```
출처 | <a href="https://www.acmicpc.net/problem/5430" target="_blank" rel="noreferrer noopener">AC [백준 5430]</a>
```

- 위 코드를 간단하게 설명하면, 위 코드는 HTML 코드이다.
-  ```<a></a>``` : a 태그는 anchor(닻)의 약자이고, 정보의 바다에 정박하는 느낌이다.
- href : href는 HyperText Reference의 약자이다. 참고로 HTML이 Hypertext Markup Language의 약자이다.
- target = "_blank" : 링크를 클릭했을 때 새창에서 페이지가 열리는 속성이다.
- rel = "noreferrer noopener" : rel은 링크의 속성을 나타낸다. 이때, target="_blank"에는 보안상 취약점이 발생하고 퍼포먼스가 저하되는 2가지 문제가 있는데, 이 문제를 해결하기 위해서 noopener noreferrer를 지정한 것이다.

- noopener 지정 : noopener(노오프너)를 지정하면, 링크된 페이지에서 window.opener을 사용해서 링크를 건 페이지를 참조(reference)할 수 없게 된다. 또한, 링크된 페이지와 링크를 건 페이지는 별개의 프로세스로 취급되기 때문에 서로 연결되어 퍼포먼스가 떨어지는 일도 없게 된다. 때문에 신뢰할 수 없는 페이지로 이동하는 링크를 만들어야할 때 유용하다.
- noreferrer 지정 : noreferrer(노리퍼러)를 지정하면 다른 페이지로 이동할 때, 링크를 건 페이지의 주소 등의 정보를 브라우저가 Referer: HTTP 헤더로 리퍼러(referer 또는 referrer)로서 송신하지 않는다.

# Reference

- 출처 | <a href="https://www.java-examples.com/stringbuffer-file-java-example" target="_blank" rel="noreferrer noopener">java-examples.com</a>

- 출처 | <a href="https://joshua-dev-story.blogspot.com/2020/12/html-rel-noopener-noreferrer.html" target="_blank" rel="noreferrer noopener">링크에 noopener noreferrer 사용하는 이유
</a>
