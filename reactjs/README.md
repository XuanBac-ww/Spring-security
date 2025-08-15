# httpClient

-dùng 2 cách: fetch - tự custom tay interceptors - csrf - xss attack

- axios: sử dụng thư viện tải npm i axios - code sẽ ngắn hơn do có thư hiện hỗ trợ xử lý phần interceptors

-- interceptors: dùng trong em xử lý dữ liệu trước khi gửi, check data sau khi có response

- fetch() -> đi qua interceptors

- environment - production - previous - development

- SSR: server site rendering
- proxy server

- hybrid redering

- mình đang dùng vite

-- status cho api riêng phan hoi sever - mình ko trả về lỗi trong các trường hợp xác định được - login báo sai tk mk - 200

-- 400 - badd reques exceoption -- dừng xử lý xác luồng sau

-- fe chỉ xử exception nếu: không tìm đc api- không kết nối được

- status trong response client: 00, 01 - trả về status tương ướng + kèm message
