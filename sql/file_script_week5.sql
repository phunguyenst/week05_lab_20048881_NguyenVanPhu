USE works

-- Insert data into the 'address' table
INSERT INTO `address` (`add_id`, `city`, `country`, `number`, `street`, `zipcode`) VALUES
(1, 'Hanoi', 234, '123', 'Quận 1', '100000'),
(2, 'Ho Chi Minh City', 258, '456', 'Quận 2', '700000'),
(3, 'Da Nang', 258, '789', 'Quận 3', '500000'),
(4, 'Hue', 258, '1011', 'Quận 4', '400000'),
(5, 'Can Tho', 258, '1213', 'Quận 5', '200000'),
(6, 'Nha Trang', 258, '1415', 'Quận 6', '600000'),
(7, 'Hanoi', 258, '1617', 'Quận 7', '100000'),
(8, 'Hue', 258, '1819', 'Quận 8', '400000'),
(9, 'Ho Chi Minh City', 258, '2021', 'Quận 9', '700000'),
(10, 'Da Nang', 258, '2223', 'Quận 10', '500000'),
(11, 'Can Tho', 258, '2425', 'Quận 11', '200000'),
(12, 'Nha Trang', 258, '2627', 'Quận 12', '600000'),
(13, 'Hanoi', 258, '2829', 'Quận Binh Thanh', '100000'),
(14, 'Hue', 258, '3031', 'Quận Tan Binh', '400000'),
(15, 'Ho Chi Minh City', 258, '3233', 'Quận Go Vap', '700000'),
(16, 'Da Nang', 258, '3435', 'Quận Phu Nhuan', '500000'),
(17, 'Can Tho', 258, '3637', 'Quận Thu Duc', '200000'),
(18, 'Nha Trang', 258, '3839', 'Quận Tan Phu', '600000'),
(19, 'Hanoi', 258, '4041', 'Quận Binh Tan', '100000'),
(20, 'Ho Chi Minh City', 258, '4243', 'Quận Cu Chi', '700000');

INSERT INTO `candidate` (`can_id`, `dob`, `email`, `full_name`, `phone`, `address`) VALUES
(1, '2002-05-28', 'sonpham28052002@gmail.com', 'Nguyễn Văn Phú', '0346676956', 2),
(2, '2000-03-15', 'nguyenhong2000@gmail.com', 'Nguyễn Văn Hồng', '0123456789', 3),
(3, '1995-11-20', 'tranminh1995@gmail.com', 'Trần Minh', '0987654321', 4),
(4, '1988-07-03', 'lethithu1988@gmail.com', 'Lê Thị Thu', '0777000000', 5),
(5, '1999-01-12', 'nguyenduc1999@gmail.com', 'Nguyễn Đức', '0333999900', 6),
(6, '1990-09-28', 'hoanglinh1990@gmail.com', 'Hoàng Linh', '0666777888', 7),
(7, '2001-04-06', 'phanthanh2001@gmail.com', 'Phan Thanh', '0988123456', 8),
(8, '1997-08-17', 'vulinh1997@gmail.com', 'Vũ Linh', '0555666777', 9),
(9, '1985-12-10', 'truongthanh1985@gmail.com', 'Trương Thanh', '0912345678', 10),
(10, '1998-06-25', 'phamminh1998@gmail.com', 'Phạm Minh', '0333222111', 11);
INSERT INTO `candidate` (`can_id`, `dob`, `email`, `full_name`, `phone`, `address`) VALUES
(11, '1993-09-08', 'ngoctram1993@gmail.com', 'Ngọc Trâm', '0123456000', 12),
(12, '1996-02-14', 'phuongthao1996@gmail.com', 'Phương Thảo', '0333444555', 13),
(13, '1987-10-29', 'thanhthuy1987@gmail.com', 'Thanh Thúy', '0888777666', 14),
(14, '1994-06-18', 'hathanh1994@gmail.com', 'Hà Thành', '0777000111', 15),
(15, '2000-03-05', 'tuananh2000@gmail.com', 'Tuấn Anh', '0999888777', 16),
(16, '1991-12-22', 'hanhphuc1991@gmail.com', 'Hạnh Phúc', '0666555444', 17),
(17, '2003-07-11', 'quanglong2003@gmail.com', 'Quang Long', '0333999888', 18),
(18, '1999-11-30', 'nguyenbao1999@gmail.com', 'Nguyễn Bảo', '0111222333', 19),
(19, '1992-04-14', 'thihuong1992@gmail.com', 'Thị Hương', '0777888999', 20);


-- Insert data into the 'skill' table
INSERT INTO `skill` (`skill_id`, `skill_desc`, `skill_name`, `skill_type`) VALUES
(1, 'Thành thạo trong lập trình Java', 'Java', 1),
(2, 'Kỹ năng lập trình C++ cao cấp', 'C++', 1),
(3, 'Chuyên sâu trong phát triển web với HTML/CSS', 'HTML/CSS', 1),
(4, 'Kinh nghiệm với JavaScript và các thư viện liên quan', 'JavaScript', 1),
(5, 'Thành thạo trong SQL và quản lý cơ sở dữ liệu', 'SQL', 1),
(6, 'Kỹ năng kiểm thử tự động phần mềm', 'Automated Testing', 1),
(7, 'Kiến thức về Machine Learning và trí tuệ nhân tạo', 'Machine Learning', 1),
(8, 'Phát triển ứng dụng Android', 'Android Development', 1),
(9, 'Kiểm thử phần mềm thủ công', 'Manual Testing', 1),
(10, 'Kỹ năng phát triển ứng dụng web bằng React.js', 'React.js', 1),
(11, 'Kỹ năng lập trình Python', 'Python', 1),
(12, 'Quản lý cơ sở dữ liệu MongoDB', 'MongoDB', 1),
(13, 'Phát triển ứng dụng web bằng Vue.js', 'Vue.js', 1),
(14, 'Phát triển ứng dụng iOS', 'iOS Development', 1),
(15, 'Kiểm thử hiệu suất phần mềm', 'Load Testing', 1),
(16, 'Kiến thức về Deep Learning', 'Deep Learning', 1),
(17, 'Kỹ năng khai thác dữ liệu', 'Data Mining', 1),
(18, 'Kỹ năng bảo mật và hack đạo đức', 'Ethical Hacking', 1),
(19, 'Quản lý dự án theo phương pháp Agile Scrum', 'Agile Scrum', 1),
(20, 'Kỹ năng sử dụng Docker cho việc triển khai ứng dụng', 'Docker', 1);





INSERT INTO `candidate_skill` (`skill_level`, `more_infos`, `skill_id`, `can_id`) VALUES
('4', 'có kinh nghiệm lập trình java, spring, html, js', 1, 1),
('3', 'Kỹ năng lập trình Python', 2, 2),
('1', 'Kỹ năng lập trình C++ cao cấp', 3, 3),
('2', 'Quản lý cơ sở dữ liệu MongoDB', 4, 4);
INSERT INTO `candidate_skill` (`skill_level`, `more_infos`, `skill_id`, `can_id`) VALUES
('1', 'Chuyên sâu trong phát triển web với HTML/CSS', 5, 5);
INSERT INTO `candidate_skill` (`skill_level`, `more_infos`, `skill_id`, `can_id`) VALUES
('2', 'Phát triển ứng dụng web bằng Vue.js', 6, 6);
INSERT INTO `candidate_skill` (`skill_level`, `more_infos`, `skill_id`, `can_id`) VALUES
('3', 'Kinh nghiệm với JavaScript và các thư viện liên quan', 7, 7);
INSERT INTO `candidate_skill` (`skill_level`, `more_infos`, `skill_id`, `can_id`) VALUES
('4', 'Phát triển ứng dụng iOS',8, 8),
('2', 'Thành thạo trong SQL và quản lý cơ sở dữ liệu', 9, 9),
('1', 'Kiểm thử hiệu suất phần mềm', 10, 10);
INSERT INTO `candidate_skill` (`skill_level`, `more_infos`, `skill_id`, `can_id`) VALUES
('1', 'Kiểm thử hiệu suất phần cứng', 20, 10);


INSERT INTO `company` (`comp_id`, `about`, `comp_name`, `email`, `phone`, `web_url`, `add_id`) VALUES
(1, 'Một công ty phần mềm hàng đầu tại Việt Nam', 'FPT Software', 'fptsoftware@gmail.com', '0123456789', 'fptsoftware.com', 11),
(2, 'Chuyên cung cấp giải pháp phần mềm cho các ngành công nghiệp', 'TMA Solutions', 'tmasolutions@gmail.com', '0987654321', 'tmasolutions.com', 12),
(3, 'Xây dựng các ứng dụng di động và web', 'Luxoft Vietnam', 'luxoftvietnam@gmail.com', '0765432109', 'luxoftvietnam.com', 13),
(4, 'Phát triển phần mềm chất lượng cao', 'KMS Technology', 'kmstechnology@gmail.com', '0333222111', 'kmstechnology.com', 14),
(5, 'Cung cấp dịch vụ phát triển ứng dụng', 'Axon Active', 'axonactive@gmail.com', '0777000000', 'axonactive.com', 15),
(6, 'Chuyên về kiểm thử phần mềm', 'LogiGear', 'logigear@gmail.com', '0999888777', 'logigear.com', 16),
(7, 'Giải pháp phát triển phần mềm toàn diện', 'Global CyberSoft (GCS)', 'gcs@gmail.com', '0888777666', 'gcs.com', 17),
(8, 'Cung cấp dịch vụ phát triển ứng dụng di động', 'NashTech', 'nashtech@gmail.com', '0777999222', 'nashtech.com', 18),
(9, 'Chuyên về phát triển phần mềm tùy chỉnh', 'Harvey Nash Vietnam', 'harveynash@gmail.com', '0666777888', 'harveynash.com', 19),
(10, 'Chuyên cung cấp dịch vụ phát triển sản phẩm phần mềm', 'Orient Software', 'orientsoftware@gmail.com', '0555999888', 'orientsoftware.com', 20);

INSERT INTO `experience` (`exp_id`, `company`, `from_date`, `role`, `to_date`, `work_desc`, `can_id`) VALUES
(1, 'ABC Tech', '2018-03-15', 'Software Developer', '2021-06-20', 'Worked on Java and web development projects.', 1),
(2, 'XYZ Solutions', '2017-06-10', 'C++ Programmer', '2019-09-30', 'Developed C++ applications for clients.', 2),
(3, 'WebDev Inc.', '2015-09-01', 'Web Developer', '2020-12-15', 'Designed and implemented web applications using HTML/CSS and JavaScript.', 3),
(4, 'Tech Solutions Group', '2010-08-25', 'Project Manager', '2017-11-30', 'Managed software development projects and teams.', 4),
(5, 'QA Testers Inc.', '2018-02-10', 'Quality Assurance Analyst', '2021-04-25', 'Conducted manual testing and reported issues.', 5),
(6, 'Mobile Apps Ltd.', '2010-01-05', 'Mobile App Developer', '2016-12-30', 'Developed Android and iOS applications.', 6),
(7, 'AI Innovations', '2018-06-20', 'Machine Learning Engineer', '2021-07-10', 'Worked on machine learning and data analysis projects.', 7),
(8, 'Data Insight Corp', '2015-03-10', 'Data Analyst', '2020-09-30', 'Analyzed data and created reports for clients.', 8),
(9, 'CyberSec Pro', '2007-07-15', 'Ethical Hacker', '2012-12-31', 'Performed ethical hacking and security assessments.', 9),
(10, 'AgileSoft Inc.', '2016-09-15', 'Scrum Master', '2021-03-20', 'Led Agile Scrum teams and managed projects.', 10),
(11, 'WebTech Solutions', '2019-04-10', 'Front-End Developer', '2022-07-25', 'Developed user interfaces using React.js and Angular.', 1),
(12, 'DataCo Enterprises', '2016-07-01', 'Database Administrator', '2018-12-15', 'Managed and optimized SQL databases.', 2),
(13, 'TechStack Inc.', '2018-10-05', 'Full-Stack Developer', '2021-03-30', 'Worked on end-to-end web development projects.', 3),
(14, 'SoftwareTech Solutions', '2014-05-15', 'Software Engineer', '2019-09-10', 'Developed desktop applications using Java.', 4),
(15, 'TestAutomation Inc.', '2019-03-01', 'Automation Tester', '2022-06-30', 'Created and maintained automated test scripts.', 5),
(16, 'iOS Apps Ltd.', '2015-08-10', 'iOS App Developer', '2019-12-20', 'Developed iOS applications for various clients.', 6),
(17, 'AI Research Labs', '2017-07-20', 'AI Researcher', '2021-09-10', 'Conducted research in deep learning and AI algorithms.', 7),
(18, 'Data Insights Ltd.', '2014-03-10', 'Data Scientist', '2020-05-30', 'Performed data analysis and predictive modeling.', 8),
(19, 'Cyber Defense Inc.', '2010-09-05', 'Security Consultant', '2015-12-31', 'Provided cybersecurity consulting and audits.', 9),
(20, 'DevOps Innovations', '2018-11-15', 'DevOps Engineer', '2021-05-25', 'Implemented Docker for containerization and CI/CD pipelines.', 10);

-- Insert data into the 'job' table
INSERT INTO `job` (`job_id`, `job_desc`, `job_name`, `comp_id`) VALUES
(1, 'biết về java core, spring data, hibernate', 'lập trình java spring boots', 5),
(2, 'Kinh nghiệm phát triển ứng dụng di động', 'Lập trình viên di động', 3),
(3, 'Lập trình ứng dụng web', 'Phát triển viên web', 7),
(4, 'Kiến thức về trí tuệ nhân tạo', 'Chuyên viên AI', 2),
(5, 'Phát triển ứng dụng Android', 'Lập trình viên Android', 1),
(6, 'Chuyên về kiểm thử phần mềm', 'Chuyên viên kiểm thử phần mềm', 4),
(7, 'Phát triển sản phẩm phần mềm', 'Phát triển sản phẩm phần mềm', 10),
(8, 'Thiết kế ứng dụng di động', 'Thiết kế viên ứng dụng di động', 5),
(9, 'Phát triển phần mềm tùy chỉnh', 'Phát triển viên phần mềm tùy chỉnh', 9),
(10, 'Chuyên về giải pháp phát triển phần mềm', 'Chuyên gia phát triển phần mềm', 6),
(11, 'Phát triển ứng dụng web', 'Lập trình viên web', 8),
(12, 'Chuyên về kiểm thử phần mềm', 'Chuyên viên kiểm thử phần mềm', 5),
(13, 'Phát triển ứng dụng di động', 'Lập trình viên di động', 3),
(14, 'Xây dựng ứng dụng web', 'Phát triển viên web', 7),
(15, 'Chuyên viên trí tuệ nhân tạo', 'Chuyên viên AI', 2),
(16, 'Thiết kế ứng dụng di động', 'Thiết kế viên ứng dụng di động', 6),
(17, 'Chuyên về phát triển sản phẩm phần mềm', 'Chuyên gia phát triển phần mềm', 4),
(18, 'Lập trình viên phần mềm tùy chỉnh', 'Lập trình viên phần mềm tùy chỉnh', 10),
(19, 'Phát triển giải pháp phần mềm', 'Phát triển viên giải pháp phần mềm', 1),
(20, 'Chuyên về phát triển phần mềm tự động', 'Chuyên viên phát triển phần mềm tự động', 9);




-- Insert data into the 'job_skill' table
-- Insert data into the 'job_skill' table
INSERT INTO `job_skill` (`skill_level`, `more_infos`, `job_id`, `skill_id`) VALUES
('3', 'có kinh nghiêm lập trình java trên 3 năm', 1, 1);
INSERT INTO `job_skill` (`skill_level`, `more_infos`, `job_id`, `skill_id`) VALUES
('4', 'lập trình frontend với reactJS', 2, 2);
INSERT INTO `job_skill` (`skill_level`, `more_infos`, `job_id`, `skill_id`) VALUES
('3', 'có kinh nghiệm lập trình app android với java', 3, 3),
('3', 'có kinh nghiệm lập trình app android', 4, 4),
('4', 'có kinh nghiệm lập trình HTML/CSS', 5, 5),
('4', 'có kinh nghiệm lập trình FrondEnd với js', 6, 6),
('4', 'có kinh nghiệm lập trình FrondEnd với reactJS', 7, 7),
('3', 'có kinh nghiệm lập trình FrondEnd với vueJS', 8, 8),
('3', 'từng lập trình với Machine Learning', 9, 9),
('2', 'có kình nghiệm lập trình python', 10, 10);


SELECT s.*
FROM skill s
WHERE NOT EXISTS (
    SELECT 1
    FROM candidate_skill cs
    WHERE cs.can_id = 6
      AND cs.skill_id = s.skill_id
)
ORDER BY s.skill_id;




