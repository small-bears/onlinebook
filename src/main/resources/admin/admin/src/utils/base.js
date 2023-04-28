const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootio69w/",
            name: "springbootio69w",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootio69w/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "网上书城"
        } 
    }
}
export default base
