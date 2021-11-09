import React, { useState } from "react";

// http와 비동기로 데이터를 주고받는 라이브러리
import axios from "axios";

function Upload() {
  // 파일 정보를 저장할 state 선언
  const [file, setFile] = useState(null);

  // 업로드할 파일이 바뀔 때마다 state의 값이 바뀌게 설정
  const onChange = (ev) => {
    setFile(ev.target.files[0]);
  };
  const onClick = () => {
    // 비동기 방식으로 데이터를 주고받기 위해 formData 함수를 사용
    const formData = new FormData();
    formData.append("file", file, file.name);

    // axios의 post 함수를 사용해 요청 주소(백엔드)에 업로드 요청
    axios.post("백엔드 주소", formData).then((res) => console.log(res));
  };

  return (
    <div>
      <form encType="multipart/form-data">
        <input type="file" onChange={onChange}></input>
        <button onClick={onClick}>업로드</button>
      </form>
    </div>
  );
}

export default Upload;
