## 프로젝트 소개
![image](https://github.com/gambae/allTheKeboard-Project/assets/103255941/5d45fe90-c4f1-4b19-9e42-3ab9af8c8a4a)

키보드 쇼핑몰 웹 사이트 개발 프로젝트

https://www.allthekeyboard.store
<br><br>

## 👀 목차
<br>

* [프로젝트 목적](#-프로젝트-목적)
* [프로젝트 기간](#-프로젝트-기간)
* [기술스택](#-기술스택)
* [시스템 아키텍쳐](#-시스템-아키텍쳐)
* [패키징 구조](#-패키징-구조)
* [E-R Diagram](#-e-r-diagram)
* [레이아웃](#-레이아웃)
* [테스트 코드](#-테스트-코드)
* [주요 기능](#-주요-기능)
    * [로그인/회원가입](#로그인회원가입)
    * [상품 등록 및 수정](#상품-등록-및-수정)
    * [상품 관리](#상품-관리)
    * [상품 목록](#상품-목록)
    * [상품 상세 페이지](#상품-상세-페이지)
    * [주문 목록](#주문-목록)
    * [장바구니](#장바구니)
    * [무중단 배포](#무중단-배포)
* [추후 개발 기능](#추후-개발-기능)
* [프로젝트를 통해 느낀점](#-프로젝트를-통해-느낀점)
<br>

## 👀 프로젝트 목적
* 스프링 부트, 스프링 시큐리티를 사용하여 웹 애플리케이션 생애 주기 기획부터 배포 유지 보수까지 전과정 개발과 운영 경험 확보
* JPA, Hibernate를 사용한 도메인 설계
* MVC 프레임워크 기반 백엔드 서버 구축
* AWS / 리눅스 기반 배포 인프라 구축
<br>

최소한의 구현능력을 학습한 이후 머릿속에 다양한 프로젝트 기획안들이 떠올랐습니다.

욕심같아서는 머릿속의 기획들을 모두 만들어서 서비스 해보고싶었지만 아직 쥬니어도 아닌 개발자 지망생으로서

우선은 준비된 쥬니어 웹 개발자가 되자 라는 눈앞의 목표를 최우선으로 삼고, 프로젝트안들을 다시 검토해 보았습니다.

'준비된 쥬니어 웹 개발자가 되기위해 나는 무엇을 준비해야할까?'

결론은 간단하게도 개발에 대한 끊임없는 공부와 열정.

그리고 그것들을 문서화하여 증명하고 공유하고 자기 PR을 하는 것이 저를 개발자 지망생이 아닌 개발자로 만들어줄 가장 빠르고 정확한 길이라고 생각했습니다.

웹 개발자로서 웹 애플리케이션의 전 과정에대해 최소 한번쯤은 숙지를 해야한다고 판단했고,

개발 연습을 위한 개발, 포트폴리오를 위한 프로젝트로 남는것이 아닌 프로덕트 단계를 넘어,

앞으로 제 프로그래밍 공부와 개발 기록, 그리고 유지보수를 같이할 키보드 쇼핑몰을 만들어 보기로 결정했습니다.
<br><br>

## 📅 프로젝트 기간
2023.12.07 ~ 2023.12.31 (추후 계속 업데이트 예정)
<br><br>

## 💪🏻 기술스택
<table>
    <tr>
        <th>구분</th>
        <th>내용</th>
    </tr>
    <tr>
        <td>Backend</td>
        <td>
          <img src="https://img.shields.io/badge/springboot-0ABF53?style=for-the-badge&logo=springboot&logoColor=white">    
          <img src="https://img.shields.io/badge/jpa-0ABF53?style=for-the-badge&logo=springboot&logoColor=white">
          <img src="https://img.shields.io/badge/springsecurity-0ABF53F?style=for-the-badge&logo=springsecurity&logoColor=white">
      </td>
    </tr>
    <tr>
        <td>Frontend</td>
        <td>
         <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black">
         <img src="https://img.shields.io/badge/thymeleaf-0ABF53?style=for-the-badge&logo=thymeleaf&logoColor=white">
         <img src="https://img.shields.io/badge/bootstrap-A100FF?style=for-the-badge&logo=bootstrap&logoColor=white">
      </td>
    </tr>
    <tr>
        <td>Database</td>
        <td>
            <img src="https://img.shields.io/badge/mysql-31A8FF?style=for-the-badge&logo=mysql&logoColor=white">
        </td>
    </tr>
    <tr>
        <td>Infra</td>
        <td>
            <img src="https://img.shields.io/badge/amazonaws-EC1C24?style=for-the-badge&logo=amazonaws&logoColor=white">
        </td>
    </tr>
    <tr>
        <td>IDE</td>
        <td>
            <img src="https://img.shields.io/badge/intellijidea-A100FF?style=for-the-badge&logo=intellijidea&logoColor=white"/>
            <img src="https://img.shields.io/badge/mysqlworkbench-31A8FF?style=for-the-badge&logo=mysql&logoColor=white">
            <img src="https://img.shields.io/badge/GitHub-5A45FF?style=for-the-badge&logo=GitHub&logoColor=white"/>
        </td>
    </tr>
</table>
<br>

## 📌 시스템 아키텍쳐
![images_prayme_post_6937cab3-5813-4b37-b4f5-b01c0eac7d7a_image](https://github.com/gambae/allTheKeboard-Project/assets/103255941/36b56238-4ba0-495e-8971-76201f9cd92b)
<br><br>

## 📌 패키징 구조

<img src="https://github.com/gambae/allTheKeboard-Project/assets/103255941/74f411f0-942b-4cc9-885b-a2b85383f81a" width="350" height="500">

<br><br>

## 📌 E-R Diagram
![image](https://github.com/gambae/allTheKeboard-Project/assets/103255941/2e7e063b-c3f0-4fc3-ad9a-7ad46eb2559e)
<br><br>

## 📌 레이아웃
<br>

![image](https://github.com/gambae/allTheKeboard-Project/assets/103255941/0ed9032a-4217-4955-b364-da83c40a6367)

![image](https://github.com/gambae/allTheKeboard-Project/assets/103255941/5c3c81f3-5123-4089-acf6-2a1d09e5e1f1)

원래는 jsp를 사용했었는데 스프링 부트에서는 타임리프를 권장하는 것을 알게 되었고

사용해 보니 문법적으로는 생소하지 않아서 어려웠지만

비즈니스 로직과 분리되어서 view 단에 집중할 수 있었고

레이아웃 기능을 통해 코드 길이를 획기적으로 줄일 수 있어서

훨씬 수월하게 view 단을 만들 수 있었습니다.

추후에는 vue.js 나 react를 공부해서 적용해 볼 예정입니다.
<br><br>

## 📌 테스트 코드

![image](https://github.com/gambae/allTheKeboard-Project/assets/103255941/46d655c6-d504-4167-9d56-72cfb3f2b1fd)

이번 프로젝트를 하면서 처음으로 테스트 코드를 작성하면서 진행해 보았습니다.

아직 본인이 하는 로직들은 복잡하지 않아서 기존의 소스코드를 수정하면서 해왔지만

로직이 복잡해지고 규모가 커진다면 잘 만들어진 테스트 케이스는 유지 보수 및 소스코드의 안정성을 위해서 정말 중요한 부분이라고 깨달았습니다.
<br><br>

## ⭐ 주요 기능
<br>

### [로그인/회원가입]

<br>

<img src="https://img.shields.io/badge/springsecurity-0ABF53F?style=for-the-badge&logo=springsecurity&logoColor=white">

스프링 시큐리티를 활용하여 로그인/회원가입 기능을 구현하였습니다.

교육받을 때는 단순히 세션이나 쿠키를 사용해서 공부를 했었는데 보안에 신경 쓰기 위해 처음으로 공부해 보고 적용해 봤습니다.

시큐리티는 버전이 바뀔 때마다 deprecated 되는 게 많아서 관련 자료들을 찾는 것에 어려움이 많았습니다.

passwordencoding, csrf 등 간단해 보이는 로그인/로그아웃 기능에 어려운 개념들을 완벽하게 이해하지는 못했지만 큰 흐름을 이해할 수 있어서 만족스러운 공부였습니다.

아직 프로젝트에 적용해 보진 않았지만 나중에는 토큰 기반 인증 jwt를 적용해 볼 예정입니다.

개인적으로는 이번 프로젝트에서 가장 개념적으로 어려웠던 부분이라고 생각합니다.

<br><br>

### [상품 등록 및 수정]

<br>

관리자 계정으로만 접근할수있으며 

상품 테이블과 상품 이미지 테이블의 연관관계 매핑을 중점으로 설계하였습니다.

![image](https://github.com/gambae/allTheKeboard-Project/assets/103255941/36d764a0-20bb-4459-b673-61169cbb1df2)

다대일 단방향 관계로 매핑하였으며 지연로딩을 설정하여 매핑된 상품 엔티티 정보가 필요 할 경우 데이터를 조회하도록 하였습니다.

<img src="https://github.com/gambae/allTheKeboard-Project/assets/103255941/f183d99e-fdcd-417a-b558-f1742e3c9314" width="600" height="200">

업로드한 파일에대한 경로,크기 설정을 하였고

<img src="https://github.com/gambae/allTheKeboard-Project/assets/103255941/7454dca0-d2a1-47a0-b91a-98a73a1fed22" width="300" height="400">

파일에 관한 서비스 클래스를 따로 두어 등록, 삭제 기능을 메서드 형식으로 사용할 수 있도록 처리했습니다.

<br><br>

### [상품 관리]

https://github.com/gambae/allTheKeboard-Project/assets/103255941/9c341565-3b26-4cd5-88e7-bf21e409cd52

<br>

상품을 조회하는 조건을 설정 후 페이징 기능을 통해 일정 개수의 상품만 불러오며

선택한 상품 상세 페이지로 이동할 수 있는 기능을 구현하도록 설계하였습니다.

조건은 상품 등록일,상품 판매 상태, 상품명 또는 상품 등록자 아이디로 설정하였습니다.

![image](https://github.com/gambae/allTheKeboard-Project/assets/103255941/d1e9a23d-8edc-4585-865d-6131077c7c56)

Querydsl을 이용해서 조건에 맞는 쿼리를 동적으로 쉽게 생성하고 비슷한 쿼리를 재활용할 수 있도록 하였습니다.

<br><br>

### [상품 목록]

https://github.com/gambae/allTheKeboard-Project/assets/103255941/4c5f02bc-c0bb-4c3c-bac0-7af7271fae97

<br>

동일하게 Querydsl을 사용하여 페이징 처리 및 상품명으로 검색이 가능하도록 구현하였습니다.
<br>

![image](https://github.com/gambae/allTheKeboard-Project/assets/103255941/22cc0ad2-64af-4e6f-b0fd-d586d8538607)

pagable 객체를 통해 보일 상품 개수와 페이지 수를 설정하였습니다.

<br><br>

### [상품 상세 페이지]

https://github.com/gambae/allTheKeboard-Project/assets/103255941/b97642ae-c85a-4084-a913-d2b578dec487

<br>

주문 및 장바구니 추가 기능을 제공하며 상품 데이터를 보여주고 제이쿼리를 통해 즉각적으로 뷰단에 적용되도록 설계했습니다.

<br><br>

### [주문 목록]

https://github.com/gambae/allTheKeboard-Project/assets/103255941/c52d0162-7d41-4a93-963f-fc585422272c

<br>

상품을 주문하면 재고에서 주문 수량만큼 재고를 감소시키고 주문 수량이 재고 수보다 클 경우 주문이 되지않도록 설계했습니다.

상품 주문에서 웹 페이지의 새로 고침 없이 서버에 주문을 요청하기 위해 비동기 방식을 사용하였습니다.

<br>

<img src="https://github.com/gambae/allTheKeboard-Project/assets/103255941/6978888e-cd77-4524-9319-dfc9f22c6519" width="500" height="400">

<br><br>

### [장바구니]

https://github.com/gambae/allTheKeboard-Project/assets/103255941/a3393839-1d6f-441b-9e9c-71f0cbefcf0d

<br>

상품 상세 페이지에서 장바구니에 담을 수량을 선택하고 버튼을 클릭할 때 장바구니에 담기는 기능,
장바구니에 들어있는 상품들을 조회하는 기능, 체크박스가 선택된 상품을 주문 및 삭제하는 기능을 중점으로 설계했습니다.

<br><br>

### [무중단 배포]

![image](https://github.com/gambae/allTheKeboard-Project/assets/103255941/83cc9262-de35-436d-accc-94ca4dd4128c)

<br>
애플리케이션 출시에 있어서 지속적 통합과 지속적 배포를 위해 깃헙, travis, AWS CodeDeploy를 사용했으며


빌드와 배포를 분리하기 위해 travis와 AWS s3를 이용했습니다

배포된 웹 앱을 제대로 서비스하기위해 letsencrypt로 ssl 인증을 받아 https 보안 프로토콜을 적용했으며,

가비아에서 도메인을 구입하고 AWS Route 53을 이용하여 도메인을 연결하였습니다.
<br>

### [추후 개발 기능]
 * <b>키보드 스위치 별 소리 확인</b>
 * <b>상품 카테고리 다양화</b>
 * <b>결제 기능 연동</b>
 * <b>커뮤니티 게시판</b>
 * <b>React 연동</b>
<br><br>

## 👨‍👩‍👦‍👦 프로젝트를 통해 느낀점
1인 프로젝트로 진행하다보니 제가 짠 코드가 정말 괜찮은 코드인지, 설계를 이렇게 하는게 과연 맞는건지, 더 좋은 구현방법은 없는지 정말 많은 고민을 하였습니다.

비전공이고 프로그래밍 공부를 시작한지 얼마 되지않아 혼자서 모든걸 해야하는 프로젝트 기간동안 깜깜한 미궁속을 헤메는 느낌도 받았습니다.

하지만 프로젝트를 진행하는 기간동안 정말 하루하루가 빠르게 지나갔고

어려운 문제를 맞닥뜨릴때 이를 해결하기위해 14시간동안 자리에 내리 앉아 골머리를 싸매며 코딩을 하면서 문제를 해결하려는 제 모습을 발견하면서

나는 개발에 몰입할 수 있다, 어떤 문제라도 해결할수 있다는 자신감을 갖게 되었습니다.

또한 아직 부족한 것이 너무 많고, 공부를 하면 할수록 새로운 공부거리가 몇배로 새로 나오고 있지만 그 모든 공부 과정이 힘들고 고통스럽기 보다는 할만하다, 재밌다는 느낌을 살면서 처음 받았습니다.

이번 프로젝트로 정말 많은것을 공부하고 배웠고, 문제에 직면했을때 이를 해결했던 크고 작은 경험들이 저에게 큰 자산이 되었다고 확신합니다.
