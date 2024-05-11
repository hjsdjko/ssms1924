const base = {
    get() {
        return {
            url : "http://localhost:8080/ssms1924/",
            name: "ssms1924",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssms1924/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "实验室管理微信小程序"
        } 
    }
}
export default base
