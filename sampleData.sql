-- Tạo dữ liệu mẫu cho Customer
INSERT INTO Customer ([customer_name], [address], Phone) VALUES
('Nguyen Van A', '123 Le Loi, HCM', '0901234567'),
('Tran Thi B', '456 Nguyen Trai, HN', '0912345678'),
('Le Van C', '789 Hai Ba Trung, DN', '0923456789');

-- Tạo dữ liệu mẫu cho Account
INSERT INTO Account ([acc_no], Balance, [password], customer_id) VALUES
('100000000001', 5000000, 'pass123', 1),
('100000000002', 10000000, 'pass456', 1),
('100000000003', 7000000, 'pass789', 2),
('100000000004', 3000000, 'pass321', 3);

-- Tạo dữ liệu mẫu cho Transaction
INSERT INTO Transactions (amount, [timestamp], account_id, customer_id) VALUES
(1000000, '2025-03-11', '100000000001', 1),
(2000000, '2025-03-10', '100000000002', 1),
(1500000, '2025-03-09', '100000000003', 2),
(500000, '2025-03-08', '100000000004', 3);
