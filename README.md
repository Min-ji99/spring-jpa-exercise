## Endpoint

### 도서
- **도서목록 조회 기능**<br>
  Get api/v1/books
  http://ec2-15-165-232-17.ap-northeast-2.compute.amazonaws.com:8080/api/v1/books
  
### 병원
- **병원목록 조회 기능**<br>
  Get api/v1/hospitals
  http://ec2-15-165-232-17.ap-northeast-2.compute.amazonaws.com:8080/api/v1/hospitals
 
- **병원 리뷰 등록**<br>
  Post api/v1/hospitals/{id}/reviews
  
- **병원 리뷰 확인**<br>
  Get api/v1/hospitals/{id}/reviews
  http://ec2-15-165-232-17.ap-northeast-2.compute.amazonaws.com:8080/api/v1/hospitals/1/reviews

- **리뷰 목록 확인**<br>
  Get api/v1/reviews
  http://ec2-15-165-232-17.ap-northeast-2.compute.amazonaws.com:8080/api/v1/reviews

- **리뷰 id로 확인**<br>
  Get api/v1/reviews/{id}
  http://ec2-15-165-232-17.ap-northeast-2.compute.amazonaws.com:8080/api/v1/reviews/1
