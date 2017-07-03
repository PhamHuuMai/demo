<?php
error_reporting(0);
ini_set('display_errors', 0);
$format = isset($_POST['format'])?$_POST['format']:'html';
$limit = isset($_POST['limit'])?$_POST['limit']:10; 
$uk_grid = isset($_POST['uk_grid'])?$_POST['uk_grid']:'';
$label = isset($_POST['label'])?$_POST['label']:'Nhãn';

$baseurl = 'http://localhost/template2/';
$pluginurl = 'http://localhost/template2/plugin/';
$imageurl = 'http://localhost/template2/upload/image/';

$data['title'] = array(
	'Mỹ vs Argentina (0-4): Messi lập siêu phẩm để phá kỷ lục',
	'Hoa hậu Việt khóa Facebook sau khi bị chê nói tiếng Anh dở',
	'Siết thời gian nhậu đêm ở Sài Gòn: Hay nhưng khó thực hiện',
	'Chuyển nhượng 22/6: Bale ký hợp đồng trọn đời với Real',
	'Hà Nội thanh tra hành vi cung cấp giới tính thai nhi',
	'Nhật sẽ giúp người Việt vay tiền dài hạn để mua nhà',
	'Tài xế vụ tai nạn thảm khốc ở đèo Prenn đang nguy kịch',
	'Chàng trai giả gái khiến Trấn Thành tán thưởng',
	'Kết quả Euro: Đức, Croatia chia nhau 2 vị trí đầu bản',
	'Lao động sang Singapore làm việc cần lưu ý những gì?',
	'Thu hồi giấy phép của công ty gia đình nguyên giám đốc sở',
	'Quốc Cường Gia Lai tham vọng tăng 4 lần doanh thu',
	'Starbucks lại bị kiện vì ăn gian lượng đồ uống',
	'Truy đuổi cướp giật làm náo loạn khu chung cư ở Sài Gòn',
	'Nợ tiền cá độ, thanh niên đâm lái xe ôm cướp tài sản',
	'Con trộm vàng, cha mẹ phải bồi thường',
	'Tạm giữ chủ tiệm cầm đồ thầu đường dây cá độ bóng đá',
);

$data['description'] = array(
	'Khi lực lượng công an có mặt, Thực đã đóng chặt cửa nhà và dùng mảnh kính vỡ kề cổ các cháu nhỏ yêu cầu công an phải cung cấp phương tiện để y về Thái Nguyên.',
	'Cha đẻ đạo diễn Bùi Thạc Chuyên mất lúc 4h sáng 22/6 tại bệnh viện Bạch Mai, thọ 77 tuổi.',
	'Ban lãnh đạo đội bóng Hoàng gia đang chuẩn bị một bản hợp đồng có thời hạn không tưởng dành cho siêu sao người xứ Wales.',
	'Di động cao cấp nhất của Sony mang đến cảm giác quen thuộc về trải nghiệm, mặc dù hãng đã thay đổi thiết kế sang sử dụng vỏ kim loại so với vỏ kính trên dòng Z.',
	'Chiếc scooter được sơn lại dàn áo và tem với họa tiết kim cương dạng đồ họa, đồng thời được gắn thêm một số món đồ chơi như đĩa Galfer, kính Rizoma Elisse.',
	'"Thời gian gần gũi bên anh sẽ là khoảnh khắc đẹp nhất trong trái tim em và các thành viên trong đoàn Trường Sa ngày ấy. Ngủ giấc ngủ ngàn thu anh nhé", nam ca sĩ tâm sự.',
	'Trước phần thi xuất sắc của học trò, cây hài phải bật dậy khỏi ghế giám khảo để vỗ tay tán thưởng.',
	'Thuộc thế hệ người mẫu vụt sáng từ mạng xã hội, Gigi Hadid luôn biết cách trở nên lộng lẫy mỗi khi xuất hiện trước đám đông.',
	'Vị trí máy bay CASA – 212 gặp nạn được xác định là tại khu vực sát đường phân định Vịnh Bắc Bộ.',
	'(Lượt cuối bảng D) Trận đấu đã đưa người xem tới những điều không thể tin nổi.',
	'Thân hình tuyệt mỹ của bà mẹ 2 con khiến nhiều cô gái trẻ cũng phải mơ ước.',
	'Người chứng kiến không khỏi ngỡ ngàng, xen lẫn cảm phục sự dũng cảm, táo bạo của cô gái này.',
	'Một người cha Trung Quốc tàn tật, liệt hai chân đã bò khắp nơi tìm con trai mất tích 15 tháng trước với...',
	'Đừng bao giờ có ý định đùa với những người "bá đạo" nếu không muốn nhận lại những... trận cười đau ruột.',
	'8 nhân viên của một ngân hàng Trung Quốc bị đánh đòn do không hoàn thành bài kiểm tra năng lực làm việc.',
);

$data['fullname'] = array(
	'Thành Sama',
	'Đỗ Huy Hiệu',
	'Phan Thúc Định',
	'Đỗ Tú Anh',
	'Đỗ Huy Hiệu',
	'Vũ Anh Long',
	'Nguyễn Thị Huế',
	'Master Chuan',
	'Đoàn Văn Mạnh',
	'Đinh Văn Lộc',
	'Lê Thành Đô',
);

$data['job'] = array(
	'Tổng giám đốc DVH-Bransons',
	'Chuyên gia bất động sản',
	'Chuyên gia phong thủy Singapore',
	'Chuyên gia huấn luyện doanh',
	'Chuyên gia Affiliate',
	'Chuyên gia internet marketing',
	'Chuyên gia Affiliate',
	'Môi giới bất động sản',
	'Tổng thư ký hội doanh nghiệp trẻ Hà Nội',
	'Chuyên gia huấn luyện doanh',
	'Giám đốc công ty An Dương',
);

$data['feedback'] = array(
	'Rõ ràng là đội ngũ iGroupBlog đã rất chú trọng đến tính bảo mật khi phát triển sản phẩm này. Ở góc độ người sử dụng tôi hoàn toàn yên tâm khi đặt công việc kinh doanh online của tôi lên hệ thống iGroupBlog.',
	'Là một hệ thống hoàn hảo với các chiến lược đã tối ưu hầu như mọi thứ để xây dựng thương hiệu cá nhân tôi chỉ việc thả lỏng và làm theo, thật đơn giản.',
	'Rõ ràng là đội ngũ iGroupBlog đã rất chú trọng đến tính bảo mật khi phát triển sản phẩm này. Ở góc độ người sử dụng tôi hoàn toàn yên tâm khi đặt công việc kinh doanh online của tôi lên hệ thống iGroupBlog.',
	'Là một hệ thống hoàn hảo với các chiến lược đã tối ưu hầu như mọi thứ để xây dựng thương hiệu cá nhân tôi chỉ việc thả lỏng và làm theo, thật đơn giản.',
	'Tôi đã chờ đợi rất lâu để được sử dụng dịch vụ của iGroup, một sản phẩm được phát triển bởi những người tuyệt vời, chỉ có đam mê với tạo nên sự khác biệt. Kích thích quá',
	'Là một hệ thống hoàn hảo với các chiến lược đã tối ưu hầu như mọi thứ để xây dựng thương hiệu cá nhân tôi chỉ việc thả lỏng và làm theo, thật đơn giản.',
	'Tôi đã dùng nó, và thực sự ai cũng có thể dùng nó, đơn giản, thú vị. BẠN PHẢI DÙNG NÓ dù bạn đếch biết làm web hay internet, nó vô cùng đơn giản. Đập tan rào cản thiết kế website trong bạn.',
	'Là một hệ thống hoàn hảo với các chiến lược đã tối ưu hầu như mọi thứ để xây dựng thương hiệu cá nhân tôi chỉ việc thả lỏng và làm theo, thật đơn giản.',
	'Rõ ràng là đội ngũ iGroupBlog đã rất chú trọng đến tính bảo mật khi phát triển sản phẩm này. Ở góc độ người sử dụng tôi hoàn toàn yên tâm khi đặt công việc kinh doanh online của tôi lên hệ thống iGroupBlog.',
	'Là một hệ thống hoàn hảo với các chiến lược đã tối ưu hầu như mọi thứ để xây dựng thương hiệu cá nhân tôi chỉ việc thả lỏng và làm theo, thật đơn giản.',
	'Là một hệ thống hoàn hảo với các chiến lược đã tối ưu hầu như mọi thứ để xây dựng thương hiệu cá nhân tôi chỉ việc thả lỏng và làm theo, thật đơn giản.',
	'Rõ ràng là đội ngũ iGroupBlog đã rất chú trọng đến tính bảo mật khi phát triển sản phẩm này. Ở góc độ người sử dụng tôi hoàn toàn yên tâm khi đặt công việc kinh doanh online của tôi lên hệ thống iGroupBlog.',
	'Là một hệ thống hoàn hảo với các chiến lược đã tối ưu hầu như mọi thứ để xây dựng thương hiệu cá nhân tôi chỉ việc thả lỏng và làm theo, thật đơn giản.',
);

$data['label'] = array(
	'Mỹ phẩm & Thời trang',
	'Mẹ và Bé',
	'Máy tính & Công nghệ',
	'Bất động sản, dịch vụ',
	'Đồ gia dụng',
	'Ô tô & Xe máy',
	'Đồ gỗ, nội thất',
	'Thực phẩm, nhà hàng',
	'Hoa, quà lưu niệm',
	'Sách, văn phòng phẩm',
	'Khác',
);

$data['background'] = array(
	'#c01b88',
	'#07a0c9',
	'#29ad61',
	'#316dab',
	'#e84c3d',
	'#ffcc00',
	'#e84c3d',
	'#c01b88',
	'#07a0c9',
	'#29ad61',
	'#ffcc00',
);

$data['background_hover'] = array(
	'#00c7ff',
	'#00b51e',
	'#f8fc0a',
	'#0015ff',
	'#f93636',
	'#dd11c6',
	'#1db3d1',
	'#06c947',
	'#f9f104',
	'#ed5757',
);
$data['about_5_list'] = array(
	'Our Company Growth',
	'1000 Employed',
	'Customer Relationship',
	'Our Company Growth',
	'1000 Employed',
	'Customer Relationship',
);
$data['getuikit_title'] = array(
	'less',
	'Components',
	'Customizer',
	'Responsive'
);
$data['getuikit_description'] = array(
	'UIkit is developed in LESS & SASS to write well-structured, extendable code which is easy to maintain.',
	'A collection of small, responsive components using consistent and conflict-free naming conventions.',
	'UIkit\'s very basic style can be extended with themes and is easy to customize to create your own look.',
	'With the mobile-first approach UIkit provides a consistent experience from phones and tablets to desktops.'
);