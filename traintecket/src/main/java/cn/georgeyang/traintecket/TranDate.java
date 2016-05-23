package cn.georgeyang.traintecket;

public class TranDate
{
	public static String[] city =
			{
					"北京北", "北京东", "北京", "北京南", "北京西", "重庆北", "重庆", "重庆南", "长春", "长春南",
					"长春西", "成都东", "成都南", "成都", "长沙", "长沙南", "阿尔山", "安康", "阿克苏", "阿里河", "阿拉山口",
					"安平", "安庆", "安顺", "鞍山", "安阳", "北安", "蚌埠", "白城", "北海", "白河", "白涧", "宝鸡", "滨江", "博克图", "百色",
					"白山市", "北台", "包头东", "包头", "北屯市", "本溪", "白云鄂博", "白银西", "亳州", "赤壁", "常德", "承德", "长甸", "赤峰", "茶陵",
					"苍南", "昌平", "崇仁", "昌图", "长汀镇", "崇信", "曹县", "楚雄", "陈相屯", "长治北", "长征", "池州", "常州", "郴州",
					"长治", "沧州", "崇左", "大安北", "大成", "丹东", "东方红", "东莞东", "大虎山", "敦煌", "敦化", "德惠", "东京城", "大涧", "都江堰",
					"大连北", "大理", "大连", "定南", "大庆", "东胜", "大石桥", "大同", "东营", "大杨树", "都匀", "邓州", "达州", "德州", "额济纳", "二连",
					"恩施", "昂昂溪", "阿城", "安达", "安定", "安广", "艾河", "安化", "艾家村", "鳌江", "安家", "阿金", "阿克陶", "安口窑", "敖力布告",
					"安龙", "阿龙山", "安陆", "阿木尔", "阿南庄", "安庆西", "鞍山西", "安塘", "安亭北", "阿图什", "安图", "安溪", "博鳌", "白壁关", "蚌埠南",
					"巴楚", "板城", "北戴河", "保定", "宝坻", "八达岭", "巴东", "柏果", "布海", "白河东", "贲红", "宝华山", "白河县",
					"白芨沟", "碧鸡关", "北滘", "碧江", "白鸡坡", "笔架山", "八角台", "保康", "白奎堡", "白狼", "百浪", "博乐", "宝拉格",
					"巴林", "宝林", "北流", "勃利", "布列开", "宝龙山", "八面城", "班猫箐", "八面通", "北马圈子", "北票南", "白旗", "宝泉岭",
					"白泉", "白沙", "巴山", "白水江", "白沙坡", "白石山", "白水镇", "坂田", "泊头", "北屯", "本溪湖", "博兴", "八仙筒", "白音察干",
					"背荫河", "北营", "巴彦高勒", "白音他拉", "鲅鱼圈", "白银市", "白音胡硕", "巴中", "霸州", "北宅", "赤壁北", "查布嘎",
					"长城", "长冲", "承德东", "赤峰西", "嵯岗", "柴岗", "长葛", "柴沟堡", "城固", "陈官营", "成高子", "草海", "柴河", "册亨",
					"草河口", "崔黄口", "巢湖", "蔡家沟", "成吉思汗", "岔江", "蔡家坡", "沧口", "昌乐", "超梁沟", "慈利", "昌黎", "长岭子", "晨明", "长农",
					"昌平北", "长坡岭", "辰清", "楚山", "长寿", "磁山", "苍石", "草市", "察素齐", "长山屯", "长汀", "昌图西", "春湾", "磁县", "岑溪", "辰溪", "磁西",
					"长兴南", "磁窑", "朝阳", "春阳", "城阳", "创业村", "朝阳川", "朝阳地", "长垣", "朝阳镇", "滁州北", "常州北", "滁州", "潮州", "常庄",
					"曹子里", "车转湾", "郴州西", "沧州西", "德安", "大安", "东安", "大坝", "大板", "大巴", "到保", "定边", "东边井", "德伯斯", "打柴沟",
					"德昌", "滴道", "大德", "大磴沟", "刀尔登", "得耳布尔", "东方", "丹凤", "东丰", "都格", "大官屯", "大关", "东光", "东莞", "东海",
					"大灰厂", "大红旗", "东海县", "德惠西", "达家沟", "东津", "杜家", "大旧庄", "大口屯", "东来", "德令哈", "大陆号", "带岭", "大林",
					"达拉特旗", "独立屯", "豆罗", "达拉特西", "东明村", "洞庙河", "东明县", "大拟", "大平房", "大盘石", "大埔", "大堡", "大其拉哈",
					"道清", "对青山", "德清西", "东升", "独山", "砀山", "登沙河", "读书铺", "大石头", "大石寨", "东台", "定陶", "灯塔", "大田边",
					"东通化", "丹徒", "大屯", "东湾", "大武口", "低窝铺", "大王滩", "大湾子", "大兴沟", "大兴", "定西", "甸心", "东乡", "代县",
					"定襄", "东戌", "东辛庄", "丹阳", "大雁", "德阳", "当阳", "丹阳北", "大英东", "东淤地", "大营", "定远", "岱岳", "大元",
					"大营镇", "大营子", "大战场", "德州东", "低庄", "东镇", "道州", "东至", "东庄", "兑镇", "豆庄", "定州", "大竹园", "大杖子",
					"豆张庄", "峨边", "二道沟门", "二道湾", "二龙", "二龙山屯", "峨眉", "二密河", "二营", "鄂州", "安阳东", "保定东", "长阳",
					"东二道河", "大苴", "大青沟", "定州东", "福州", "福州南", "贵阳", "广州北", "广州东", "广州", "广州南", "哈尔滨", "哈尔滨东",
					"哈尔滨西", "合肥", "合肥西", "呼和浩特东", "呼和浩特", "海口东", "海口", "杭州", "杭州南", "济南", "济南东", "济南西", "防城港", "福鼎",
					"风陵渡", "涪陵", "富拉尔基", "抚顺北", "佛山", "阜新", "阜阳", "格尔木", "广汉", "古交", "桂林北", "古莲", "桂林", "固始", "广水",
					"干塘", "广元", "赣州", "公主岭", "公主岭南", "淮安", "鹤北", "淮北", "淮滨", "河边", "潢川", "韩城", "邯郸", "横道河子", "鹤岗",
					"皇姑屯", "红果", "黑河", "怀化", "汉口", "葫芦岛", "海拉尔", "霍林郭勒", "海伦", "侯马", "哈密", "淮南", "桦南", "海宁西", "鹤庆",
					"怀柔北", "怀柔", "黄石东", "华山", "黄石", "黄山", "衡水", "衡阳", "菏泽", "贺州", "汉中", "惠州", "吉安", "集安", "江边村", "晋城",
					"金城江", "景德镇", "嘉峰", "加格达奇", "井冈山", "蛟河", "金华南", "金华西", "九江", "吉林", "荆门", "佳木斯", "济宁", "集宁南",
					"酒泉", "江山", "吉首", "九台", "镜铁山", "鸡西", "蓟县", "绩溪县", "嘉峪关", "江油", "锦州", "金州", "福安", "防城", "丰城", "丰城南",
					"肥东", "发耳", "富海", "福海", "凤凰城", "奉化", "富锦", "范家屯", "福利屯", "丰乐镇", "阜南", "阜宁", "抚宁", "福清", "福泉",
					"丰水村", "丰顺", "繁峙", "抚顺", "福山口", "扶绥", "冯屯", "浮图峪", "富县东", "凤县", "富县", "费县", "凤阳", "汾阳", "扶余北",
					"分宜", "富源", "扶余", "富裕", "抚州北", "凤州", "丰镇", "范镇", "固安", "广安", "高碑店", "沟帮子", "甘草店", "谷城", "藁城", "高村",
					"古城镇", "广德", "贵定", "贵定南", "古东", "贵港", "官高", "葛根庙", "干沟", "甘谷", "高各庄", "甘河", "根河", "郭家店",
					"孤家子", "高老", "古浪", "皋兰", "高楼房", "归流河", "关林", "甘洛", "郭磊庄", "高密", "公庙子", "工农湖", "广宁寺", "广南卫",
					"高平", "甘泉北", "共青城", "甘旗卡", "甘泉", "高桥镇", "赶水", "灌水", "孤山口", "果松", "高山子", "嘎什甸子", "高台", "高滩",
					"古田", "官厅", "广通", "官厅西", "贵溪", "涡阳", "巩义", "高邑", "巩义南", "固原", "菇园", "公营子", "光泽", "古镇", "瓜州", "高州",
					"固镇", "盖州", "官字井", "革镇堡", "冠豸山", "盖州西", "红安", "淮安南", "红安西", "海安县", "黄柏", "海北", "鹤壁", "华城", "合川",
					"河唇", "汉川", "海城", "黑冲滩", "黄村", "海城西", "化德", "洪洞", "横峰", "韩府湾", "汉沽", "黄瓜园", "红光镇", "浑河",
					"红花沟", "黄花筒", "贺家店", "和静", "红江", "黑井", "获嘉", "河津", "涵江", "华家", "河间西", "花家庄", "河口南", "黄口",
					"湖口", "呼兰", "葫芦岛北", "浩良河", "哈拉海", "鹤立", "桦林", "黄陵", "海林", "虎林", "寒岭", "和龙", "海龙", "哈拉苏",
					"呼鲁斯太", "火连寨", "黄梅", "蛤蟆塘", "韩麻营", "黄泥河", "海宁", "惠农", "和平", "花棚子", "花桥", "宏庆", "怀仁", "华容", "华山北",
					"黄松甸", "和什托洛盖", "红山", "汉寿", "衡山", "黑水", "惠山", "虎什哈", "红寺堡", "虎石台", "海石湾", "衡山西", "红砂岘", "黑台",
					"桓台", "和田", "会同", "海坨子", "黑旺", "海湾", "红星", "徽县", "红兴隆", "换新天", "红岘台",
					"红彦", "合阳", "海阳", "衡阳东", "华蓥", "汉阴", "黄羊滩", "汉源", "湟源", "河源", "花园", "黄羊镇",
					"化州", "黄州", "霍州", "惠州西", "巨宝", "靖边", "金宝屯", "晋城北", "金昌", "鄄城", "交城", "建昌",
					"峻德", "井店", "鸡东", "江都", "鸡冠山", "金沟屯", "静海", "金河", "锦河", "锦和", "精河", "精河南", "江华",
					"建湖", "纪家沟", "晋江", "江津", "姜家", "金坑", "芨岭", "金马村", "角美", "江门", "莒南", "井南", "建瓯", "经棚",
					"江桥", "九三", "金山北", "京山", "建始", "嘉善", "稷山", "吉舒", "建设", "甲山", "建三江", "嘉善南", "金山屯", "江所田",
					"景泰", "吉文", "进贤", "莒县", "嘉祥", "介休", "井陉", "嘉兴", "嘉兴南", "夹心子", "简阳", "揭阳", "建阳", "姜堰", "巨野",
					"江永", "靖远", "缙云", "江源", "济源", "靖远西", "胶州北", "焦作东", "靖州", "荆州", "金寨", "晋州", "胶州", "锦州南", "焦作",
					"旧庄窝", "金杖子", "富川", "抚远", "高碑店东", "革居", "光明城", "高邑西", "鹤壁东", "寒葱沟", "邯郸东", "合肥北城", "洪河",
					"虎门", "哈密南", "淮南东", "建水", "昆明", "昆明西", "拉萨", "兰州东", "兰州", "兰州西", "南昌", "南京", "南京南", "南宁",
					"库尔勒", "开封", "岢岚", "凯里", "喀什", "昆山南", "奎屯", "开原", "六安", "灵宝", "芦潮港", "隆昌", "陆川", "利川",
					"临川", "潞城", "鹿道", "娄底", "临汾", "良各庄", "临河", "漯河", "绿化", "隆化", "丽江", "临江", "龙井", "吕梁", "醴陵",
					"柳林南", "滦平", "六盘水", "灵丘", "旅顺", "陇西", "澧县", "兰溪", "临西", "耒阳", "洛阳", "龙岩", "洛阳东", "连云港东", "临沂",
					"洛阳龙门", "柳园", "凌源", "辽源", "立志", "柳州", "辽中", "麻城", "免渡河", "牡丹江", "莫尔道嘎", "满归", "明光", "漠河", "梅江",
					"茂名东", "茂名", "密山", "马三家", "麻尾", "绵阳", "梅州", "满洲里", "宁波东", "南岔", "南充", "南丹", "南大庙", "南芬", "讷河",
					"嫩江", "内江", "南平", "南通", "南阳", "碾子山", "开安", "库车", "康城", "库都尔", "宽甸", "克东", "开江", "康金井", "喀喇其", "开鲁",
					"克拉玛依", "口前", "奎山", "昆山", "克山", "开通", "康熙岭", "克一河", "开原西", "康庄", "来宾", "老边", "灵宝西", "龙川",
					"乐昌", "黎城", "聊城", "蓝村", "林东", "乐都", "梁底下", "六道河子", "鲁番", "廊坊", "落垡", "廊坊北", "禄丰", "老府", "兰岗",
					"龙骨甸", "芦沟", "龙沟", "拉古", "临海", "林海", "拉哈", "凌海", "柳河", "六合", "龙华", "滦河沿", "六合镇", "亮甲店", "刘家店",
					"刘家河", "连江", "李家", "罗江", "廉江", "庐江", "两家", "龙江", "龙嘉", "莲江口", "蔺家楼", "李家坪", "兰考", "林口", "路口铺",
					"老莱", "拉林", "陆良", "龙里", "零陵", "临澧", "兰棱", "卢龙", "喇嘛甸", "里木店", "洛门", "龙南", "梁平", "罗平", "落坡岭", "六盘山",
					"乐平市", "临清", "龙泉寺", "乐善村", "冷水江东", "连山关", "流水沟", "陵水", "乐山", "罗山", "鲁山", "丽水", "梁山", "灵石", "露水河",
					"庐山", "林盛堡", "柳树屯", "梨树镇", "龙山镇", "李石寨", "黎塘", "轮台", "芦台", "龙塘坝", "濑湍", "骆驼巷", "李旺", "莱芜东",
					"狼尾山", "灵武", "莱芜西", "朗乡", "陇县", "临湘", "莱西", "林西", "滦县", "略阳", "莱阳", "辽阳", "临沂北", "凌源东", "连云港",
					"老羊壕", "临颍", "老营", "龙游", "罗源", "林源", "涟源", "涞源", "耒阳西", "临泽", "龙爪沟", "雷州", "六枝", "鹿寨", "来舟", "龙镇",
					"拉鲊", "明安", "马鞍山", "毛坝", "毛坝关", "麻城北", "渑池", "明城", "庙城", "渑池南", "茅草坪", "猛洞河", "磨刀石", "弥渡",
					"帽儿山", "明港", "梅河口", "马皇", "孟家岗", "美兰", "汨罗东", "马莲河", "茅岭", "庙岭", "茂林", "穆棱", "马林", "马龙", "汨罗",
					"木里图", "密马龙", "玛纳斯湖", "冕宁", "沐滂", "马桥河", "闽清", "民权", "明水河", "麻山", "眉山", "漫水湾", "茂舍祖", "米沙子",
					"庙台子", "美溪", "勉县", "麻阳", "牧羊村", "米易", "麦园", "墨玉", "密云", "庙庄", "米脂", "明珠", "宁安", "农安", "南博山", "南仇",
					"南城司", "宁村", "宁德", "南观村", "南宫东", "南关岭", "宁国", "宁海", "南河川", "南华", "泥河子", "宁家", "牛家", "南靖", "能家",
					"南口", "南口前", "南朗", "乃林", "尼勒克", "那罗", "宁陵县", "奈曼", "宁明", "南木", "南平南", "那铺", "南桥", "那曲", "暖泉", "南台",
					"南头", "宁武", "南湾子", "南翔北", "宁乡", "内乡", "牛心台", "南峪", "娘子关", "南召", "南杂木", "库伦", "漯河西", "明港东", "蒙自北",
					"上海", "上海南", "上海虹桥", "上海西", "天津北", "天津", "天津南", "天津西", "石家庄北", "石家庄", "沈阳", "沈阳北", "沈阳东",
					"太原北", "太原东", "太原", "平顶山", "盘锦", "平凉", "平凉南", "平泉", "坪石", "萍乡", "凭祥", "郫县西", "攀枝花", "蕲春", "青城山",
					"青岛", "清河城", "黔江", "曲靖", "前进镇", "齐齐哈尔", "七台河", "沁县", "泉州东", "泉州", "衢州", "融安", "汝箕沟", "瑞金", "日照",
					"双城堡", "绥芬河", "韶关东", "山海关", "绥化", "三间房", "苏家屯", "舒兰", "三明", "神木", "三门峡", "商南", "遂宁", "四平", "商丘",
					"上饶", "韶山", "宿松", "汕头", "邵武", "涉县", "三亚", "邵阳", "十堰", "双鸭山", "松原", "深圳", "苏州", "随州", "宿州", "朔州",
					"深圳西", "塘豹", "塔尔气", "潼关", "塘沽", "塔河", "通化", "泰来", "吐鲁番", "通辽", "铁岭", "陶赖昭", "图们", "铜仁", "唐山北",
					"田师府", "泰山", "天水", "唐山", "通远堡", "太阳升", "泰州", "桐梓", "通州西", "平安", "蓬安", "平安驿", "磐安镇", "平安镇", "蒲城东",
					"蒲城", "裴德", "偏店", "平顶山西", "坡底下", "瓢儿屯", "平房", "平岗", "平关", "盘关", "平果", "徘徊北", "平河口", "盘锦北", "潘家店",
					"皮口", "普兰店", "偏岭", "平山", "彭山", "皮山", "彭水", "磐石", "平社", "平台", "平田", "莆田", "葡萄菁", "普湾", "平旺", "平型关",
					"普雄", "平洋", "彭阳", "平遥", "平邑", "平原堡", "平原", "平峪", "彭泽", "邳州", "平庄", "泡子", "平庄南", "乾安", "庆安", "迁安",
					"祁东北", "七甸", "曲阜东", "庆丰", "奇峰塔", "曲阜", "勤丰营", "琼海", "秦皇岛", "千河", "清河", "清河门", "清华园", "渠旧", "綦江",
					"潜江", "全椒", "秦家", "祁家堡", "清涧县", "秦家庄", "七里河", "渠黎", "秦岭", "青龙山", "青龙寺", "祁门", "前磨头", "青山", "全胜",
					"确山", "清水", "前山", "戚墅堰", "青田", "桥头", "青铜峡", "前卫", "前苇塘", "渠县", "祁县", "青县", "桥西", "清徐", "旗下营", "千阳",
					"沁阳", "泉阳", "祁阳北", "七营", "庆阳山", "清远", "清原", "钦州东", "全州", "钦州", "青州市", "瑞安", "荣昌", "瑞昌", "如皋", "容桂",
					"任丘", "乳山", "融水", "热水", "容县", "饶阳", "汝阳", "绕阳河", "汝州", "石坝", "上板城", "施秉", "上板城南", "世博园", "双城北",
					"商城", "莎车", "顺昌", "舒城", "神池", "沙城", "石城", "山城镇", "山丹", "顺德", "绥德", "邵东", "水洞", "商都", "十渡", "四道湾",
					"顺德学院", "绅坊", "双丰", "四方台", "水富", "三关口", "桑根达来", "韶关", "上高镇", "上杭", "沙海", "松河", "沙河", "沙河口",
					"赛汗塔拉", "沙河市", "沙后所", "山河屯", "三河县", "四合永", "三汇镇", "双河镇", "石河子", "三合庄", "三家店", "水家湖", "沈家河",
					"松江河", "尚家", "孙家", "沈家", "松江", "三江口", "司家岭", "松江南", "石景山南", "邵家堂", "三江县", "三家寨", "十家子", "松江镇",
					"施家嘴", "深井子", "什里店", "疏勒", "疏勒河", "舍力虎", "石磷", "绥棱", "石岭", "石林", "石林南", "石龙", "萨拉齐", "索伦", "商洛",
					"沙岭子", "三门峡南", "三门县", "石门县", "三门峡西", "肃宁", "宋", "双牌", "四平东", "遂平", "沙坡头", "商丘南", "水泉", "石泉县",
					"石桥子", "石人城", "石人", "山市", "神树", "鄯善", "三水", "泗水", "石山", "松树", "首山", "三十家", "三十里堡", "松树镇", "松桃",
					"索图罕", "三堂集", "石头", "神头", "沙沱", "上万", "孙吴", "沙湾县", "遂溪", "沙县", "绍兴", "歙县", "石岘", "上西铺", "石峡子", "绥阳",
					"沭阳", "寿阳", "水洋", "三阳川", "上腰墩", "三营", "顺义", "三义井", "三源浦", "三原", "上虞", "上园", "水源", "桑园子", "绥中北",
					"苏州北", "宿州东", "深圳东", "深州", "孙镇", "绥中", "尚志", "师庄", "松滋", "师宗", "苏州园区", "苏州新区", "石嘴山", "泰安", "台安",
					"通安驿", "桐柏", "通北", "汤池", "桐城", "郯城", "铁厂", "桃村", "通道", "田东", "天岗", "土贵乌拉", "通沟", "太谷", "塔哈", "棠海",
					"唐河", "泰和", "太湖", "团结", "谭家井", "陶家屯", "唐家湾", "统军庄", "泰康", "吐列毛杜", "图里河", "亭亮", "田林", "铜陵", "铁力",
					"铁岭西", "天门", "天门南", "太姥山", "土牧尔台", "土门子", "潼南", "洮南", "太平川", "太平镇", "图强", "台前", "天桥岭", "土桥子",
					"汤山城", "桃山", "塔石嘴", "通途", "汤旺河", "同心", "土溪", "桐乡", "田阳", "桃映", "天义", "汤阴", "驼腰岭", "太阳山", "汤原",
					"塔崖驿", "滕州东", "台州", "天祝", "滕州", "天镇", "桐子林", "天柱山", "前锋", "庆盛", "深圳北", "通海", "武汉", "王家营西", "乌鲁木齐",
					"西安北", "西安", "西安南", "西宁西", "银川", "郑州", "五常", "武昌", "瓦房店", "威海", "芜湖", "乌海西", "吴家屯", "武隆", "乌兰浩特",
					"渭南", "威舍", "歪头山", "武威", "武威南", "无锡", "乌西", "乌伊岭", "武夷山", "万源", "万州", "梧州", "温州", "温州南", "西昌", "许昌",
					"西昌南", "香坊", "轩岗", "兴国", "宣汉", "新会", "新晃", "锡林浩特", "兴隆县", "厦门北", "厦门", "厦门高崎", "秀山", "小市", "向塘",
					"宣威", "新乡", "信阳", "咸阳", "襄阳", "熊岳城", "兴义", "新沂", "新余", "徐州", "延安", "宜宾", "亚布力南", "叶柏寿", "宜昌东",
					"永川", "宜春", "宜昌", "盐城", "运城", "伊春", "榆次", "杨村", "伊尔施", "燕岗", "永济", "延吉", "营口", "牙克石", "阎良", "玉林",
					"榆林", "一面坡", "伊宁", "阳平关", "玉屏", "原平", "延庆", "阳泉曲", "玉泉", "阳泉", "玉山", "营山", "燕山", "榆树", "鹰潭", "烟台",
					"伊图里河", "玉田县", "义乌", "阳新", "义县", "益阳", "岳阳", "永州", "扬州", "淄博", "镇城底", "自贡", "珠海", "珠海北", "湛江", "镇江",
					"张家界", "张家口", "张家口南", "周口", "哲里木", "扎兰屯", "驻马店", "肇庆", "周水子", "昭通", "中卫", "资阳", "遵义",
					"枣庄", "资中", "株洲", "枣庄西", "文安", "武安", "王安镇", "旺苍", "五叉沟", "文昌", "温春", "五大连池", "文登", "五道沟",
					"五道河", "文地", "卫东", "武当山", "望都", "乌尔旗汗", "潍坊", "万发屯", "王府", "瓦房店西", "王岗", "武功", "湾沟", "吴官田",
					"乌海", "苇河", "卫辉", "吴家川", "五家", "威箐", "午汲", "渭津", "王家湾", "倭肯", "五棵树", "五龙背", "乌兰哈达", "万乐", "瓦拉干",
					"温岭", "五莲", "乌拉特前旗", "乌拉山", "卧里屯", "渭南北", "乌奴耳", "万宁", "万年", "渭南南", "渭南镇", "沃皮", "吴堡", "吴桥",
					"汪清", "武清", "温泉", "武山", "文水", "魏善庄", "王瞳", "五台山", "王团庄", "五五", "无锡东", "卫星", "闻喜", "武乡", "无锡新区",
					"武穴", "吴圩", "王杨", "五营", "武义", "瓦窑田", "五原", "苇子沟", "韦庄", "五寨", "王兆屯", "微子镇", "魏杖子", "新安", "兴安",
					"新安县", "新保安", "下板城", "西八里", "宣城", "兴城", "小村", "新绰源", "下城子", "新城子", "喜德", "小得江", "西大庙", "小董",
					"小东", "西斗铺", "息烽", "信丰", "襄汾", "新干", "孝感", "西固城", "夏官营", "西岗子", "襄河", "新和", "宣和", "斜河涧", "新华屯",
					"新华", "新化", "宣化", "兴和西", "小河沿", "下花园", "小河镇", "徐家", "峡江", "新绛", "辛集", "新江", "西街口", "许家屯",
					"许家台", "谢家镇", "兴凯", "小榄", "香兰", "兴隆店", "新乐", "新林", "小岭", "新李", "西林", "西柳", "仙林", "新立屯", "小路溪",
					"兴隆镇", "新立镇", "新民", "西麻山", "下马塘", "孝南", "咸宁北", "兴宁", "咸宁", "西平", "兴平", "新坪田", "霞浦", "溆浦", "犀浦",
					"新青", "新邱", "兴泉堡", "仙人桥", "小寺沟", "杏树", "夏石", "浠水", "下社", "徐水", "小哨", "新松浦", "杏树屯", "许三湾", "湘潭",
					"邢台", "仙桃西", "下台子", "徐闻", "新窝铺", "修武", "新县", "息县", "西乡", "湘乡", "西峡", "孝西", "小新街",
					"新兴县", "西小召", "小西庄", "向阳", "旬阳", "旬阳北", "襄阳东", "兴业", "小雨谷", "信宜", "小月旧", "小扬气",
					"祥云", "襄垣", "夏邑县", "新友谊", "新阳镇", "徐州东", "新帐房", "悬钟", "新肇", "忻州", "汐子", "西哲里木", "新杖子",
					"姚安", "依安", "永安", "永安乡", "渔坝村", "亚布力", "元宝山", "羊草", "秧草地", "阳澄湖", "迎春", "叶城",
					"盐池", "砚川", "阳春", "宜城", "应城", "禹城", "晏城", "羊场", "阳城", "阳岔", "郓城", "雁翅", "云彩岭",
					"虞城县", "营城子", "永登", "英德", "尹地", "永定", "雁荡山", "于都", "园墩", "英德西", "永福", "永丰营", "杨岗",
					"阳高", "阳谷", "友好", "余杭", "沿河城", "岩会", "羊臼河", "永嘉", "营街", "盐津", "余江", "叶集", "燕郊", "姚家",
					"岳家井", "一间堡", "英吉沙", "云居寺", "燕家庄", "永康", "营口东", "银浪", "永郎", "宜良北", "永乐店", "伊拉哈",
					"伊林", "彝良", "杨林", "余粮堡", "杨柳青", "月亮田", "亚龙湾", "杨陵镇", "义马", "云梦", "元谋", "阳明堡", "一面山",
					"玉门镇", "沂南", "宜耐", "伊宁东", "一平浪", "营盘水", "羊堡", "营盘湾", "阳泉北", "乐清", "焉耆", "源迁", "姚千户屯",
					"阳曲", "榆树沟", "月山", "玉石", "偃师", "沂水", "榆社", "窑上", "元氏", "杨树岭", "野三坡", "榆树屯", "榆树台",
					"鹰手营子", "源潭", "牙屯堡", "烟筒山", "烟筒屯", "羊尾哨", "越西", "攸县", "玉溪", "永修", "酉阳", "余姚", "弋阳东",
					"岳阳东", "阳邑", "鸭园", "鸳鸯镇", "燕子砭", "宜州", "仪征", "兖州", "迤资", "羊者窝", "杨杖子", "镇安", "治安", "招柏",
					"张百湾", "枝城", "子长", "诸城", "邹城", "赵城", "章党", "肇东", "照福铺", "章古台", "赵光", "中和", "中华门", "枝江北",
					"钟家村", "朱家沟", "紫荆关", "周家", "诸暨", "镇江南", "周家屯", "郑家屯", "褚家湾", "湛江西", "朱家窑", "曾家坪子",
					"张兰", "镇赉", "枣林", "扎鲁特", "扎赉诺尔西", "樟木头", "中牟", "中宁东", "中宁", "中宁南", "镇平", "漳平", "泽普",
					"枣强", "张桥", "章丘", "朱日和", "泽润里", "中山北", "樟树东", "中山", "柞水", "钟山", "樟树", "珠窝", "张维屯",
					"彰武", "棕溪", "钟祥", "资溪", "镇西", "张辛", "正镶白旗", "紫阳", "枣阳", "竹园坝", "张掖", "镇远", "朱杨溪",
					"漳州东", "漳州", "壮志", "子洲", "中寨", "涿州", "咋子", "卓资山", "株洲西", "许昌东", "孝感北", "邢台东", "新乡东",
					"西阳村", "信阳东", "雨格", "正定机场", "织金", "驻马店西", "涿州东", "卓资东", "郑州东"};





	public static String[] cityCode = {
			"VAP", "BOP", "BJP", "VNP", "BXP", "CUW", "CQW", "CRW", "CCT", "CET", "CRT", "ICW", "CNW", "CDW",
			"CSQ", "CWQ", "ART", "AKY", "ASR", "AHX", "AKR", "APT", "AQH", "ASW", "AST", "AYF", "BAB", "BBH",
			"BCT", "BHZ", "BEL", "BAP", "BJY", "BJB", "BKX", "BIZ", "HJL", "BTT", "BDC", "BTC", "BXR", "BXT",
			"BEC", "BXJ", "BZH", "CBN", "VGQ", "CDP", "CDT", "CFD", "CDG", "CEH", "CPP", "CRG", "CTT", "CDB",
			"CIJ", "CXK", "COM", "CXT", "CBF", "CZJ", "IYH", "CZH", "CZQ", "CZF", "COP", "CZZ", "RNT", "DCT",
			"DUT", "DFB", "DMQ", "DHD", "DHJ", "DHL", "DHT", "DJB", "DFP", "DDW", "DFT", "DKM", "DLT", "DNG",
			"DZX", "DOC", "DQT", "DTV", "DPK", "DUX", "RYW", "DOF", "RXW", "DZP", "EJC", "RLC", "ESN", "AAX",
			"ACB", "ADX", "ADP", "AGT", "AHP", "PKQ", "AJJ", "ARH", "AJB", "AJD", "AER", "AYY", "ALD", "AUZ",
			"ASX", "ALN", "JTX", "AZM", "APH", "AXT", "ATV", "ASH", "ATR", "ATL", "AXS", "BWQ", "BGV", "BMH",
			"BCR", "BUP", "BEP", "BDP", "BPP", "ILP", "BNN", "BGM", "BUT", "BIY", "BVC", "BWH", "BEY", "BJJ",
			"BJM", "IBQ", "BLQ", "BBM", "BSB", "BTD", "BKD", "BKB", "BAT", "BRZ", "BOR", "BQC", "BLX", "BNB",
			"BOZ", "BLB", "BLR", "BND", "BMD", "BNM", "BMB", "BRP", "RPD", "BQP", "BQB", "BQL", "BSW", "BAY",
			"BSY", "BPM", "BAL", "BUM", "BTQ", "BZP", "BYP", "BHT", "BXK", "VXD", "BYC", "BYB", "BIV", "BAC",
			"BID", "BYT", "BNJ", "BCD", "IEW", "RMP", "BVP", "CIN", "CBC", "CEJ", "CCM", "CCP", "CID", "CAX",
			"CGT", "CEF", "CGV", "CGY", "CAJ", "CZB", "WBW", "CHB", "CHZ", "CKT", "CHP", "CIH", "CJT", "CJX",
			"CAM", "CJY", "CKK", "CLK", "CYP", "CUQ", "CLP", "CLT", "CMB", "CNJ", "VBP", "CPM", "CQB", "CSB",
			"EFW", "CSP", "CST", "CSL", "CSC", "CVT", "CES", "CPT", "CQQ", "CIP", "CNZ", "CXQ", "CRP", "CFH",
			"CYK", "CYD", "CAL", "CEK", "CEX", "CYL", "CDD", "CYF", "CZL", "CUH", "ESH", "CXH", "CKQ", "CVK",
			"CFP", "CWM", "ICQ", "CBP", "DAG", "RAT", "DAZ", "DBJ", "DBC", "DBD", "RBT", "DYJ", "DBB", "RDT",
			"DGJ", "DVW", "DDB", "DEM", "DKJ", "DRD", "DRX", "UFQ", "DGY", "DIL", "DMM", "DTT", "RGW", "DGP",
			"DAQ", "DHB", "DHP", "DQD", "DQH", "DXT", "DJT", "DKB", "DJL", "DJM", "DKP", "RVD", "DHO", "DLC",
			"DLB", "DLD", "DIC", "DTX", "DLV", "DNC", "DMD", "DEP", "DNF", "DNZ", "DPD", "RPP", "DPI", "DVT",
			"DQX", "DML", "DQB", "MOH", "DRQ", "RWW", "DKH", "DWT", "DPM", "DSL", "RZT", "DBH", "DQK", "DGT",
			"DBM", "DTL", "RUH", "DNT", "DRJ", "DFJ", "DWJ", "DZZ", "DFM", "DXL", "DXX", "DSJ", "DXM", "DXG",
			"DKV", "DXV", "RXP", "DXD", "DYH", "DYX", "DYW", "DYN", "EXH", "IAW", "DBV", "DYV", "EWH", "RYV",
			"DYZ", "DJP", "DZD", "DTJ", "DIP", "DVQ", "DNV", "DFZ", "DCH", "DZV", "DWV", "ROP", "DXP", "DZY",
			"DAP", "RZP", "EBW", "RDP", "RDX", "RLD", "ELA", "EMW", "RML", "RYJ", "ECN", "ADF", "BMP", "CYN",
			"DRB", "DIM", "DSD", "DOP", "FZS", "FYS", "GIW", "GBQ", "GGQ", "GZQ", "IZQ", "HBB", "VBB", "VAB",
			"HFH", "HTH", "NDC", "HHC", "HMQ", "VUQ", "HZH", "XHH", "JNK", "JAK", "JGK", "FEZ", "FES", "FLV",
			"FLW", "FRX", "FET", "FSQ", "FXD", "FYH", "GRO", "GHW", "GJV", "GBZ", "GRX", "GLZ", "GXN", "GSN",
			"GNJ", "GYW", "GZG", "GLT", "GBT", "AUH", "HMB", "HRH", "HVN", "HBV", "KCN", "HCY", "HDP", "HDB",
			"HGB", "HTT", "HEM", "HJB", "HHQ", "HKN", "HLD", "HRX", "HWD", "HLB", "HMV", "HMR", "HAH", "HNB",
			"EUH", "HQM", "HBP", "HRP", "OSN", "HSY", "HSN", "HKH", "HSP", "HYQ", "HIK", "HXZ", "HOY", "HCQ",
			"VAG", "JAL", "JBG", "JCF", "JJZ", "JCG", "JFF", "JGX", "JGG", "JHL", "RNH", "JBH", "JJG", "JLL",
			"JMN", "JMB", "JIK", "JAC", "JQJ", "JUH", "JIQ", "JTL", "JVJ", "JXB", "JKP", "JRH", "JGJ", "JFW",
			"JZD", "JZT", "FAS", "FAZ", "FCG", "FNG", "FIH", "FEM", "FHX", "FHR", "FHT", "FHH", "FIB", "FTT",
			"FTB", "FZB", "FNH", "AKH", "FNP", "FQS", "VMW", "FSJ", "FUQ", "FSV", "FST", "FKP", "FSZ", "FTX",
			"FYP", "FDY", "FXY", "FEY", "FXK", "FUH", "FAV", "FBT", "FYG", "FYM", "FYT", "FYX", "FBG", "FZY",
			"FZC", "VZK", "GFP", "VJW", "GBP", "GBD", "GDJ", "GCN", "GEP", "GCV", "GZB", "GRH", "GTW", "IDW",
			"GDV", "GGZ", "GVP", "GGT", "GGL", "GGJ", "GGP", "GAX", "GEX", "GDT", "GKT", "GOB", "GLJ", "GEJ",
			"GFM", "GHT", "GLF", "VOW", "GLP", "GMK", "GMC", "GRT", "GNT", "GNM", "GPF", "GEY", "GAG", "GQD",
			"GQY", "GZD", "GSW", "GST", "GSP", "GSL", "GSD", "GXD", "GTJ", "GAY", "GTS", "GTP", "GOM", "KEP",
			"GXG", "GYH", "GXF", "GIP", "GYF", "GUJ", "GYL", "GYD", "GZS", "GNQ", "GZJ", "GSQ", "GEH", "GXT",
			"GOT", "GZT", "GSS", "GAT", "HWN", "AMH", "VXN", "HIH", "HBL", "HEB", "HAF", "VCQ", "WKW", "HCZ",
			"HCN", "HCT", "HCJ", "HCP", "HXT", "HGC", "HDV", "HFG", "HXJ", "HGP", "HYM", "IGW", "HHT", "VHD",
			"HUD", "HJJ", "HJR", "HFM", "HIM", "HJF", "HJV", "HJS", "HJT", "HXP", "HJM", "HKJ", "KOH", "HKG",
			"HUB", "HPD", "HHB", "HIT", "HOB", "HIB", "ULY", "HRB", "VLB", "HAT", "HLL", "HIL", "HAX", "VTJ",
			"HLT", "VEH", "HMT", "HYP", "HHL", "HNH", "HMJ", "VAQ", "HZM", "VQH", "HEY", "HRV", "HRN", "HDY",
			"HDL", "VSR", "VSB", "VSQ", "HSQ", "HOT", "VCH", "HHP", "HSJ", "HUT", "HSO", "HEQ", "VSJ", "HQB",
			"VTK", "VTR", "VTQ", "HZT", "HWK", "RWH", "VXB", "HYY", "VHB", "VTB", "HTJ", "VIX", "HAY", "HYK",
			"HVQ", "HUW", "HQY", "HGJ", "WHW", "HNO", "VIQ", "HUN", "HYJ", "HZZ", "VON", "HZV", "VXQ", "JRT",
			"JIY", "JBD", "JEF", "JCJ", "JCK", "JNV", "JFD", "JDB", "JFP", "JOB", "UDH", "JST", "VGP", "JHP",
			"JHX", "JHB", "JHQ", "JHR", "JIR", "JHZ", "AJH", "VJD", "JJS", "JJW", "JJB", "JKT", "JLJ", "JMM",
			"JES", "JWQ", "JOK", "JNP", "JVS", "JPC", "JQX", "SSX", "EGH", "JCN", "JRN", "JSH", "JVV", "JSL",
			"JET", "JOP", "JIB", "EAH", "JTB", "JOM", "JTJ", "JWX", "JUG", "JKK", "JUK", "JXV", "JJP", "JXH",
			"EPH", "JXT", "JYW", "JRQ", "JYS", "UEH", "JYK", "JYZ", "JYJ", "JYH", "SZL", "JYF", "JXJ", "JZK",
			"WEF", "JEQ", "JBN", "JZH", "JXP", "JXK", "JOD", "JOF", "JVP", "JYD", "FDZ", "FYB", "GMP", "GEM",
			"IMQ", "GNP", "HFF", "HKB", "HPP", "COH", "HPB", "IUQ", "HLR", "HOH", "JSM", "KMM", "KXM", "LSO",
			"LVJ", "LZJ", "LAJ", "NCG", "NJH", "NKH", "NNZ", "KLR", "KFF", "KLV", "KLW", "KSR", "KNH", "KTR",
			"KYT", "UAH", "LBF", "UCH", "LCW", "LKZ", "LCN", "LCG", "UTP", "LDL", "LDQ", "LFV", "LGP", "LHC",
			"LON", "LWJ", "UHP", "LHM", "LQL", "LJL", "LHV", "LLG", "LKV", "UPP", "UMW", "LVV", "LST", "LXJ",
			"LEQ", "LWH", "UEP", "LYQ", "LYF", "LYS", "LDF", "UKH", "LVK", "LLF", "DHR", "LYD", "LYL", "LZX",
			"LZZ", "LZD", "MCN", "MDX", "MDB", "MRX", "MHX", "MGH", "MVX", "MKQ", "MDQ", "MMZ", "MSB", "MJT",
			"VAW", "MYW", "MOQ", "MLX", "NVH", "NCB", "NCW", "NDZ", "NMP", "NFT", "NHX", "NGX", "NJW", "NPS",
			"NUH", "NFF", "NZX", "KAT", "KCR", "KCP", "KDX", "KDT", "KOB", "KAW", "KJB", "KQX", "KLC", "KHR",
			"KQL", "KAB", "KSH", "KSB", "KTT", "KXZ", "KHX", "KXT", "KZP", "UBZ", "LLT", "LPF", "LUQ", "LCQ",
			"UCP", "UCK", "LCK", "LRC", "LDO", "LDP", "LVP", "LVM", "LJP", "LOP", "LFP", "LFM", "UFD", "LNB",
			"LGM", "LOM", "LGJ", "LGB", "UFH", "LXX", "LHX", "JID", "LNL", "KLH", "LHP", "UNP", "LEX", "LRT",
			"UDT", "LVT", "LKS", "LJB", "LJW", "LJZ", "UJH", "UJT", "LJX", "UJL", "LHB", "ULK", "LIJ", "LKF",
			"LKB", "LKQ", "LAX", "LAB", "LRM", "LLW", "UWZ", "LWQ", "LLB", "UAP", "LMX", "LMB", "LMJ", "UNG",
			"UQW", "LPM", "LPP", "UPJ", "LPG", "UQK", "UQJ", "LUM", "UDQ", "LGT", "USP", "LIQ", "UTW", "LRN",
			"LAF", "USH", "LMK", "LSV", "LUL", "LSG", "LBT", "LSD", "LSB", "LAS", "LET", "LTZ", "LAR", "LTP",
			"LBM", "LVZ", "LTJ", "VLJ", "LWK", "LRJ", "LNJ", "UXK", "LXB", "LXY", "LXQ", "LXK", "LXC", "UXP",
			"LYY", "LYK", "LYT", "UYK", "LDD", "UIH", "LYC", "LNF", "LXL", "LMH", "LVS", "LYX", "LAQ", "LYP",
			"LPQ", "LEJ", "LZT", "UAQ", "LIW", "LIZ", "LZS", "LZA", "LEM", "MAC", "MAH", "MBY", "MGY", "MBN",
			"MCF", "MCL", "MAP", "MNF", "KPM", "MUQ", "MOB", "MDF", "MRB", "MGN", "MHL", "MHZ", "MGB", "MHQ",
			"MQQ", "MHB", "MLZ", "MLL", "MLD", "MLB", "MID", "MGM", "MLQ", "MUD", "MMM", "MNR", "UGW", "MPQ",
			"MQB", "MQS", "MQF", "MUT", "MAB", "MSW", "MKW", "MOM", "MST", "MZB", "MEB", "MVY", "MVQ", "MCM",
			"MMW", "MYS", "MUR", "MUP", "MZJ", "MEY", "MFQ", "NAB", "NAT", "NBK", "NCK", "NSP", "NCZ", "NES",
			"NGP", "NFP", "NLT", "NNH", "NHH", "NHJ", "NHS", "NHD", "NVT", "NJB", "NJS", "NJD", "NKP", "NKT",
			"NNQ", "NLD", "NIR", "ULZ", "NLF", "NMD", "NMZ", "NMX", "NNS", "NPZ", "NQD", "NQO", "NQJ", "NTT",
			"NOQ", "NWV", "NWP", "NEH", "NXQ", "NXF", "NXT", "NUP", "NIP", "NAF", "NZT", "KLD", "LBN", "MDN",
			"MBM", "SHH", "SNH", "AOH", "SXH", "TBP", "TJP", "TIP", "TXP", "VVP", "SJP", "SYT", "SBT", "SDT",
			"TBV", "TDV", "TYV", "PEN", "PVD", "PIJ", "POJ", "PQP", "PSQ", "PXG", "PXZ", "PCW", "PRW", "QRN",
			"QSW", "QDK", "QYP", "QNW", "QJM", "QEB", "QHX", "QTB", "QVV", "QRS", "QYS", "QEH", "RAZ", "RQJ",
			"RJG", "RZK", "SCB", "SFB", "SGQ", "SHD", "SHB", "SFX", "SXT", "SLL", "SMS", "OMY", "SMF", "ONY",
			"NIW", "SPT", "SQF", "SRG", "SSQ", "OAH", "OTQ", "SWS", "OEP", "SEQ", "SYQ", "SNN", "SSB", "VYT",
			"SZQ", "SZH", "SZN", "OXH", "SUV", "OSQ", "TBQ", "TVX", "TGY", "TGP", "TXX", "THL", "TLX", "TFR",
			"TLD", "TLT", "TPT", "TML", "RDQ", "FUP", "TFT", "TAK", "TSJ", "TSP", "TYT", "TQT", "UTH", "TZW",
			"TAP", "PAL", "PAW", "PNO", "PAJ", "PZT", "PEY", "PCY", "PDB", "PRP", "BFF", "PXJ", "PRT", "PFB",
			"PGL", "PGM", "PAM", "PGZ", "PHP", "PHM", "PBD", "PDP", "PKT", "PLT", "PNT", "PSB", "PSW", "PSR",
			"PHW", "PSL", "PSV", "PVT", "PTM", "PTS", "PTW", "PWT", "PWV", "PGV", "POW", "PYX", "PYJ", "PYV",
			"PIK", "PPJ", "PYK", "PYP", "PZG", "PJH", "PZD", "POD", "PND", "QOT", "QAB", "QQP", "QRQ", "QDM",
			"QAK", "QFT", "QVP", "QFK", "QFM", "QYQ", "QTP", "QUY", "QIP", "QHD", "QHP", "QJZ", "QJW", "QJN",
			"INH", "QJB", "QBT", "QNY", "QZV", "QLD", "QLZ", "QLY", "QGH", "QSM", "QIH", "QMP", "QSB", "QVB",
			"QSN", "QUJ", "QXQ", "QYH", "QVH", "QAT", "QTJ", "QWD", "QWP", "QRW", "QXV", "QXP", "QXJ", "QUV",
			"QXC", "QOY", "QYF", "QYL", "QVQ", "QYJ", "QSJ", "QBQ", "QYT", "QDZ", "QZZ", "QRZ", "QZK", "RAH",
			"RCW", "RCG", "RBH", "RUQ", "RQP", "ROK", "RSZ", "RSD", "RXZ", "RVP", "RYF", "RHD", "ROF", "OBJ",
			"SBP", "AQW", "OBP", "ZWT", "SBB", "SWN", "SCR", "SCS", "OCH", "SMV", "SCP", "SCT", "SCL", "SDJ",
			"ORQ", "ODY", "SOQ", "SIL", "SXC", "SEP", "OUD", "OJQ", "OLH", "OFB", "STB", "OTW", "OKJ", "OGC",
			"SNQ", "SVK", "JBS", "SED", "SBM", "SHP", "SKT", "SHC", "VOP", "SSD", "SHL", "OXP", "OHD", "OZW",
			"SEL", "SZR", "SVP", "ODP", "SQH", "OJJ", "SJL", "SJB", "SUB", "OJB", "SAH", "SKD", "OLK", "IMH",
			"SRP", "SJJ", "SOZ", "SMM", "SJD", "OZL", "SHM", "SWT", "OMP", "SUR", "SHJ", "VLD", "SPB", "SIB",
			"SOL", "SLM", "LNM", "SLQ", "SLC", "SNT", "OLY", "SLP", "SCF", "OQH", "OMQ", "SXF", "SYP", "SOB",
			"SBZ", "PPT", "SON", "SFJ", "SPF", "SID", "SXY", "SQT", "SRB", "SRL", "SQB", "SWB", "SSR", "SJQ",
			"OSK", "SAD", "SFT", "SAT", "SRD", "SST", "SSL", "MZQ", "SHX", "SDH", "OTB", "SEV", "SFM", "SWP",
			"SKB", "SXR", "SXZ", "SAS", "SOH", "OVH", "SXL", "SXM", "SXJ", "SYB", "FMH", "SYV", "OYP", "SYJ",
			"SPJ", "OEJ", "SOP", "OYD", "SYL", "SAY", "BDH", "SUD", "OYJ", "SAJ", "SND", "OHH", "SRH", "BJQ",
			"OZP", "OZY", "SZD", "SZB", "SNM", "SIN", "SEM", "KAH", "ITH", "SZJ", "TMK", "TID", "TAJ", "TBF",
			"TBB", "TCX", "TTH", "TZK", "TCL", "TCK", "TRQ", "TDZ", "TGL", "TGC", "TOL", "TGV", "THX", "THM",
			"THF", "THG", "TKH", "TIX", "TNJ", "TOT", "PDQ", "TZP", "TKX", "TMD", "TEX", "TIZ", "TFZ", "TJH",
			"TLB", "PXT", "TMN", "TNN", "TLS", "TRC", "TCJ", "TVW", "TVT", "TIT", "TEB", "TQX", "TTK", "TQL",
			"TQJ", "TCT", "TAB", "TIM", "TUT", "THB", "TXJ", "TSW", "TCH", "TRZ", "TKQ", "TND", "TYF", "TIL",
			"TYJ", "TYB", "TYP", "TEK", "TZH", "TZJ", "TXK", "TZV", "TEW", "QWH", "QFB", "QSQ", "IOQ", "TAM",
			"WHN", "KNM", "WMR", "EAY", "XAY", "CAY", "XXO", "YIJ", "ZZF", "WCB", "WCN", "WDT", "WKK", "WHH",
			"WXC", "WJT", "WLW", "WWT", "WNY", "WSM", "WIT", "WUJ", "WWJ", "WXH", "WXR", "WPB", "WAS", "WYY",
			"WYW", "WZZ", "RZH", "VRH", "ECW", "XCF", "ENW", "XFB", "XGV", "EUG", "XHY", "EFQ", "XLQ", "XTC",
			"EXP", "XKS", "XMS", "XBS", "ETW", "XST", "XTG", "XWM", "XXF", "XUN", "XYY", "XFN", "XYT", "XRZ",
			"VIH", "XUG", "XCH", "YWY", "YBW", "YWB", "YBD", "HAN", "YCW", "YCG", "YCN", "AFH", "YNV", "YCB",
			"YCV", "YBP", "YET", "YGW", "YIV", "YJL", "YKT", "YKX", "YNY", "YLZ", "ALY", "YPB", "YMR", "YAY",
			"YZW", "YPV", "YNP", "YYV", "YQB", "AQP", "YNG", "NUW", "AOP", "YRT", "YTG", "YAK", "YEX", "ATP",
			"YWH", "YON", "YXD", "AEQ", "YYQ", "AOQ", "YLH", "ZBK", "ZDV", "ZGW", "ZHQ", "ZIQ", "ZJZ", "ZJH",
			"DIQ", "ZKP", "ZMP", "ZKN", "ZLC", "ZTX", "ZDN", "ZVQ", "ZIT", "ZDW", "ZWJ", "ZYW", "ZIW", "ZEK",
			"ZZW", "ZZQ", "ZFK", "WBP", "WAP", "WVP", "WEW", "WCT", "WEQ", "WDB", "WRB", "WBK", "WDL", "WHP",
			"WNZ", "WVT", "WRN", "WDP", "WHX", "WFK", "WFB", "WUT", "WXT", "WGB", "WGY", "WGL", "WGM", "WVC",
			"WHB", "WHF", "WCJ", "WUB", "WAM", "WJP", "WJL", "WJJ", "WQB", "WKT", "WBT", "WLC", "WEB", "WVX",
			"VHH", "WLK", "WQC", "WSC", "WLX", "WBY", "WRX", "WNQ", "WWG", "WVY", "WNJ", "WPT", "WUY", "WUP",
			"WQL", "WWP", "WQM", "WSJ", "WEV", "WSP", "WTP", "WSV", "WZJ", "WVR", "WGH", "WVB", "WXV", "WVV",
			"IFH", "WXN", "WYZ", "WYB", "WWB", "RYH", "WIM", "WYC", "WZL", "WZY", "WZV", "WZB", "WQP", "WKD",
			"EAM", "XAZ", "XAF", "XAP", "EBP", "XLP", "ECH", "XCD", "XEM", "XRX", "XCB", "XCT", "EDW", "EJM",
			"XMP", "XEZ", "XOD", "XPC", "XFW", "EFG", "XFV", "EGG", "XGN", "XUJ", "XGJ", "NBB", "XXB", "XIR",
			"XWJ", "EEP", "XAX", "XHB", "EHQ", "XHP", "XEC", "XYD", "XYP", "EKY", "XJB", "EJG", "XJV", "ENP",
			"XJM", "EKM", "XJT", "XTJ", "XMT", "EKB", "EAQ", "XNB", "XDD", "ELP", "XPX", "XLB", "XLJ", "XYB",
			"GCT", "XPH", "XLD", "XLM", "XZB", "XGT", "XMD", "XMB", "XAT", "XNV", "XRN", "ENQ", "XNN", "XPN",
			"XPY", "XPM", "XOS", "EPQ", "XIW", "XQB", "XQD", "XQJ", "XRL", "ESP", "XSB", "XIZ", "XZN", "XSV",
			"XSP", "XAM", "XOB", "XDT", "XSJ", "XTQ", "XTP", "XAN", "EIP", "XJQ", "EPD", "XWF", "XSN", "ENN",
			"XQY", "XXQ", "XIF", "XOV", "XXM", "XGQ", "XZC", "XXP", "XDB", "XUY", "XBY", "XWN", "SNZ", "XHM",
			"EEQ", "XFM", "XYX", "EXM", "EIF", "EJH", "EYB", "XZJ", "UUH", "XZX", "XRP", "XZT", "XXV", "XZD",
			"XRD", "ERP", "YAC", "YAX", "YAS", "YNB", "YBM", "YBB", "YUD", "YAB", "YKM", "AIH", "YYB", "YER",
			"YKJ", "YYY", "YQQ", "YIN", "YHN", "YCK", "YEK", "YED", "YNF", "YAL", "YPK", "YAP", "ACP", "IXH",
			"YCT", "YDJ", "YDQ", "YDM", "YGS", "YGH", "YDG", "YAJ", "IIQ", "YFZ", "YYM", "YRB", "YOV", "YIK",
			"YOB", "EVH", "YHP", "AEP", "YHM", "URH", "YAM", "AEW", "YHG", "YCH", "AJP", "YAT", "YGJ", "YJT",
			"YIR", "AFP", "AZK", "RFH", "YGT", "YJX", "YLW", "YSM", "YDY", "YLX", "YLB", "ALW", "YLM", "YLD",
			"YQP", "YUM", "TWQ", "YSY", "YMF", "YMN", "YMM", "YVV", "YST", "YXJ", "YNK", "YVM", "YNR", "YIM",
			"YZJ", "ABM", "YPC", "YPP", "UPH", "YSR", "AQK", "YQT", "YQV", "YGP", "YBF", "YSJ", "YSF", "YUK",
			"YSV", "ASP", "YSP", "YAD", "AIP", "YSX", "YUT", "YIP", "YTQ", "YTZ", "YSL", "YUX", "YWM", "YHW",
			"YOG", "YXM", "ACG", "AFW", "YYH", "YIG", "YIQ", "ARP", "YYL", "YYJ", "YZY", "YSZ", "UZH", "YZK",
			"YQM", "AEM", "YZD", "ZEY", "ZAD", "ZBP", "ZUP", "ZCN", "ZHY", "ZQK", "ZIK", "ZCV", "ZHT", "ZDB",
			"ZFM", "ZGD", "ZGB", "ZHX", "VNH", "ZIN", "ZJY", "ZUB", "ZYP", "ZOB", "ZDH", "ZEH", "ZOD", "ZJD",
			"CWJ", "ZWQ", "ZUJ", "ZBW", "ZLV", "ZLT", "ZIV", "ZLD", "ZXX", "ZOQ", "ZGF", "ZDJ", "VNJ", "ZNJ",
			"ZPF", "ZPS", "ZPR", "ZVP", "ZQY", "ZTK", "ZRC", "ZLM", "ZGQ", "ZOG", "ZSQ", "ZSY", "ZSZ", "ZSG",
			"ZOP", "ZWB", "ZWD", "ZOY", "ZTN", "ZXS", "ZVT", "ZIP", "ZXC", "ZVY", "ZYN", "ZAW", "ZYJ", "ZUW",
			"ZXW", "GOS", "ZUS", "ZUX", "ZZY", "ZZM", "ZXP", "ZAL", "ZZC", "ZAQ", "XVF", "XJN", "EDP", "EGF",
			"XQF", "OYN", "VTM", "ZHP", "IZW", "ZLN", "ZAP", "ZDC", "ZAF"};

}
