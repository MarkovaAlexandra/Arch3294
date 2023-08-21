# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.cloud import Cloud  # noqa: E501
from swagger_server.models.error import Error  # noqa: E501
from swagger_server.test import BaseTestCase


class TestCloudsController(BaseTestCase):
    """CloudsController integration test stubs"""

    def test_cancel_cloud_by_id(self):
        """Test case for cancel_cloud_by_id

        отмена заказа в облаке по id
        """
        response = self.client.open(
            '/api/vi/clouds/{cloud_id}'.format(cloud_id='cloud_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_cloud(self):
        """Test case for create_cloud

        Создает заказ в облаке
        """
        response = self.client.open(
            '/api/vi/clouds',
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_order_by_id(self):
        """Test case for create_order_by_id

        создание заказа по id облака
        """
        response = self.client.open(
            '/api/vi/clouds/{cloud_id}'.format(cloud_id='cloud_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_clouds(self):
        """Test case for get_all_clouds

        Метод получение списка ресурсов на облаке
        """
        response = self.client.open(
            '/api/vi/clouds',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
